import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(gcd(arr[0], arr[1]) + "\n" + lcm(arr[0], arr[1]));
        bw.close();
    }

    // a > b 일 때, a를 b로 나눈다.
    // 나머지 r1이 0이라면 그 때의 b가 최대 공약수이다.
    // 나머지 r1이 0이 아니라면, b를 다시 r1으로 나눈다.
    // 나머지 r2가 0이라면 그 때의 r1이 최대 공약수이다.
    // 나머지 r2가 0이 아니라면, r1을 다시 r2로 나눈다.
    // 과정을 반복하여, 나머지가 0이 되는 시점의 r(n)이 최대 공약수이다.
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int r = a % b;
        return gcd(b, r);
    }

    // a와 b의 최대 공약수를 구한다
    // a와 b를 곱한 후, 최대 공약수로 나눈다.
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
