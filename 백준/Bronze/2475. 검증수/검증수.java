import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double sum = Arrays.stream(arr).mapToDouble(n -> Math.pow(n,2)).sum();
        bw.write(String.valueOf((int) (sum % 10)));
        bw.close();
    }
}
