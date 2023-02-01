class Solution {
    public int solution(int number, int limit, int power) {
        //1. 1부터 number까지 각 숫자마다 약수의 갯수를 구한다
        //2. 각 숫자마다의 약수의 갯수가 곧 해당 숫자 단원의 무기의 공격력이 된다
        //3. 근데 제한 수치를 넘을 경우, 해당 숫자의 약수의 갯수가 몇 개든 무기의 공격력을 power로 고정한다.
        //4. 이렇게 해서 모든 숫자들의 무기 공격력의 합이 곧 필요한 철의 합이기 때문에 이를 반환한다.
        int answer = 0;
        int[] damageArray = new int[number];
        for (int i = 1; i <= number; i++) {
            damageArray[i-1] = calculateDivisor(i);
            damageArray[i-1] = damageArray[i-1] > limit ? power : damageArray[i-1];
            answer += damageArray[i-1];
        }
        return answer;
    }
    public int calculateDivisor(int n){
        int divisorCount = 0;
        for (int i = 1; i * i<= n; i++) {
            if(i * i == n){
                divisorCount++;
            } else if(n%i==0){
                divisorCount+=2;
            }
        }
        return divisorCount;
    }
}