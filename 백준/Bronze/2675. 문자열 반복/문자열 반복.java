import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int repeatCnt = Integer.parseInt(s[0]);
            String[] eachChars = s[1].split("");
            for (String eachChar : eachChars) {
                bw.write(eachChar.repeat(repeatCnt));
            }
            bw.newLine();
        }
        bw.close();
    }
}
