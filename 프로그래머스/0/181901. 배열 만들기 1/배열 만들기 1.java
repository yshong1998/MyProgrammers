class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[(int) n / k];
        int flag = 0;
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                answer[flag++] = i;
            }
        }
        return answer;
    }
}