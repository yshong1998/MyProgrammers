class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = (int) Math.ceil((double) num_list.length / n);
        int[] answer = new int[length];
        for(int i = 0; i < length; i++){
            answer[i] = num_list[i*n];
        }
        return answer;
    }
}