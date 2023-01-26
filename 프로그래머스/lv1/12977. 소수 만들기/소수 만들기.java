class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(isPrimeNumber(nums[i], nums[j], nums[k])){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public boolean isPrimeNumber(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        int divisorNumber = 0;
        for (int i = 1; i <= sum; i++) {
            if(sum % i == 0){
                divisorNumber++;
            }
        }
        if(divisorNumber == 2){
            return true;
        }
        return false;
    }
}