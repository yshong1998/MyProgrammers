class Solution {
    public int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean isPrime(int number){
        int divisorCnt = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                divisorCnt++;
            }
        }
        return divisorCnt == 1;
    }
}