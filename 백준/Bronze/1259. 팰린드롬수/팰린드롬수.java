import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /**
         * 0번째 수와 length-1 번째 수가 일치
         * 1번째 수와 length-2 번째 수가 일치
         * n번째 수와 length-n-1 번째 수가 일치
         * ...
         */
        String s;
        while (!Objects.equals(s = br.readLine(), "0")){
            int[] arr = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
            String answer = "yes";
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - i - 1]){
                    answer = "no";
                    break;
                }
            }
            bw.write(answer);
            bw.newLine();
        }
        bw.close();
    }
}