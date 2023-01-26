class Solution {
    public long solution(int price, int money, int count) {
        long answer;
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += (long) price * i;
        }
        if(money >= totalPrice){
            answer = 0;
        } else {
            answer = totalPrice - money;
        }
        return answer;
    }
}
