import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[][] userPattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] answerCnt = {0,0,0};

        for (int i = 0; i < userPattern.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (userPattern[i][j % userPattern[i].length] == answers[j]) {
                    answerCnt[i]++;
                }
            }
        }
        int maxAnswerCnt = Arrays.stream(answerCnt).max().getAsInt();
        List<Integer> winners = new ArrayList<>();
        for (int i = 0; i < answerCnt.length; i++) {
            if (answerCnt[i] == maxAnswerCnt){
                winners.add(i + 1);
            }
        }
        return winners;
    }
}
