import java.util.Arrays;
class Solution{
       public int solution(int[] nums){
        int answer = 0;
        int cnt = 1;
        Arrays.sort(nums);

        for(int i = 0; i <nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                cnt++;
            }
        }
        if (cnt >= nums.length/2){
            answer = nums.length/2;
        } else
            answer = cnt;
        return answer;
    }

}