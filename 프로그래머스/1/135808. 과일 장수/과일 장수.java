import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxCnt = score.length / m;
        int[][] boxes = new int[boxCnt][m];
        int index = score.length - 1;
        Arrays.sort(score);
        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < m; j++) {
                boxes[i][j] = score[index - j];
            }
            index -= m;
            answer += boxes[i][m-1] * m;
        }
        return answer;
    }
}