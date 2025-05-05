import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int[] arr = br.lines().distinct().mapToInt(Integer::parseInt).sorted().toArray();
        for (int i : arr) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.close();
    }
}
