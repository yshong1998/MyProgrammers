import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int cardCnt = Integer.parseInt(s[0]);
        int limit = Integer.parseInt(s[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int total = 0;
        for (int i = 0; i < cardCnt - 2; i++) {
            for (int j = i + 1; j < cardCnt - 1; j++) {
                for (int k = j + 1; k < cardCnt; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= limit && sum >= total) {
                        total = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(total));
        bw.close();
    }
}
