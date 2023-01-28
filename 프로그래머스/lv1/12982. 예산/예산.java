import java.util.Arrays;

class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if(d[i] <= budget){
                answer++;
                budget -= d[i];
            } else {
                return answer;
            }
        }
        return answer;
    }
}