class Solution {
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 1){ // 홀수라면
            for (int i = 0; i < arr.length; i+=2) {
                // 짝수 인덱스에 n을 모두 더해라
                arr[i] += n;
            }
        } else {
            for (int i = 1; i < arr.length; i+=2) {
                // 홀수 인덱스에 n을 모두 더해라
                arr[i] += n;
            }
        }
        return arr;
    }
}