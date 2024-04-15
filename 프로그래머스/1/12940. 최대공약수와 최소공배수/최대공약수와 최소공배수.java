import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        return answer;
    }
    // 최대 공약수, greatest common divisor
    // a에서 b를 나눈 나머지 c를 구하고,
    // b를 a에, c를 b에 대입하는 과정을 c가 0이 될 때까지 반복하면 최대 공약수가 나온다.
    // c가 반드시 0이 되는 이유는, 나누어 떨어지지 않는 경우가 아무리 계속 나와도
    // 마지막의 직전에는 c가 1이 되는 순간이 등장할 수밖에 없기 때문이다.
    public int gcd(int a, int b){
        if (b == 0) return a; // 나누어 떨어진 이후에 실행되는 라인
        return gcd(b, a%b); // 나누어 떨어지지 않은 경우 실행되는 라인,
    }
    // 최소 공배수, least common multiple
    // a와 b를 곱한 값 c를 구하고,
    // c를 최대 공약수로 나누면 최소 공배수가 등장한다.
    // 90과 21을 예로 들면
    // 90 = 2 * 3 * 3 * 5
    // 21 = 3 * 7, 최대 공약수는 3
    // 겹치는 소수는 최고차항만 곱하고, 겹치지 않는 소수는 모두 곱한다.
    // -> 2 * 3 * 3 * 5 * 7 = 420
    // 최대 공약수로 나누어도 답이 나오는 이유는
    // 최대 공약수가 두 수가 모두 갖고 있는 소수만으로 이루어져 있기 때문에
    // 중복을 없애준다는 느낌이기 때문이다.
    // 90에도 약수 공약수 3이, 21에도 공약수 3이 있는데 이를 한 쪽에서만 활용해서 최소 공배수 계산에 적용하도록 해 주는 것.
    public int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}