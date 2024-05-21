import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] temp = Arrays.copyOfRange(num_list, 0, n);
        int[] temp2 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] answer = new int[num_list.length];
        for(int i = 0; i< temp2.length; i++){
            answer[i] = temp2[i];
        }
        for(int i = temp2.length; i < num_list.length; i++){
            answer[i] = temp[i-temp2.length];
        }
        return answer;
    }
}