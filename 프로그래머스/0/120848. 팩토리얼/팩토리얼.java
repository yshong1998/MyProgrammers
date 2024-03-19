class Solution {
    public int solution(int n) {
        int i = 0;
        int answer = 0;
        while (answer < n){
            if (factorial(++i) <= n){
                answer = factorial(i);
            } else {
                i--;
                break;
            }
        }
        return i;
    }
        
    public int factorial(int number){
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        return total;
    }
}