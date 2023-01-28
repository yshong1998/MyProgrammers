import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> lottoList = IntStream.of(lottos).boxed().collect(Collectors.toList());
        List<Integer> winNumList = IntStream.of(win_nums).boxed().collect(Collectors.toList());
        int[] answer = new int[2];
        int matchNumber = 0;
        int zeroNumber = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (winNumList.contains(lottoList.get(i))) {
                matchNumber++;
            }
            if (lottoList.get(i) == 0) {
                zeroNumber++;
            }
        }
        answer[1] = 7 - matchNumber;
        answer[0] = 7 - (matchNumber + zeroNumber);
        if (answer[1] >= 6) {
            answer[1] = 6;
        }
        if(answer[0] >= 6){
            answer[0] = 6;
        }
        return answer;
    }
}