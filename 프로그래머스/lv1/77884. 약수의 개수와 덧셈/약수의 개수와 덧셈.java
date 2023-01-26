class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (; left <= right; left++) {
            if(getDivisorNumber(left) % 2 == 0){
                answer += left;
            }
            else if(getDivisorNumber(left) % 2 == 1){
                answer -= left;
            }
        }

        return answer;
    }

    private int getDivisorNumber(int number) {
        int divisor = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                divisor++;
            }
        }
        return divisor;
    }
}