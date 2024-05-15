class Solution {
    public int solution(int[] num_list) {
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                firstSum += num_list[i];
            } else {
                secondSum += num_list[i];
            }
        }
        return firstSum > secondSum ? firstSum : secondSum;
    }
}