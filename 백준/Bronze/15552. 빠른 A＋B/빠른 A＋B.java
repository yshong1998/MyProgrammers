import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String cnt = br.readLine();
        for (int i = 0; i < Integer.parseInt(cnt); i++) {
            String s = br.readLine();
            int[] intArr = Arrays.stream(s.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int sum = intArr[0] + intArr[1];
            bw.append(String.valueOf(sum));
            bw.newLine();
        }
        bw.close();
    }
}