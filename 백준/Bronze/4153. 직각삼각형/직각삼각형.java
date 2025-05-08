import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while ((s = br.readLine()) != null && !s.equals("0 0 0")) {
            int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)){
                bw.write("right");
            } else {
                bw.write("wrong");
            }
            bw.newLine();
        }
        bw.close();
    }
}
