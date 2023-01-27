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
    public int solution2(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
//                제곱수인 경우 약수의 개수가 홀수
            if(i% Math.sqrt(i)==0){
                answer -= i;
            }
//            제곱수가 아닌 경우 약수읙 개수가 짝수
            else{
                answer += i;
            }
        }
        return answer;
    }
}