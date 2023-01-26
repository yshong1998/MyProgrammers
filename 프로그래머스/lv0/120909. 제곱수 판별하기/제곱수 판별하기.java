class Solution {
    public static int solution(int n){
        int sqrtNumber = (int) Math.sqrt(n);
        if(sqrtNumber * sqrtNumber == n){
            return 1;
        }
        return 2;
    }
}