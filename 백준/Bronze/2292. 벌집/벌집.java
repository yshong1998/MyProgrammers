import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()) - 1;
        /**
         * n이 0 => 1
         * n이 6 이하 => 2
         * n이 6 + 12 이하 => 3
         * n이 6 + 12 + 18 이하 => 4
         * n이 6(k(k+1))/2 이하 =>  1+k
         */
        int k = 0;
        while (n > 6 * (k * (k + 1)) / 2) {
            k++;
        }
        bw.write(String.valueOf(k + 1));
        bw.close();
    }
}