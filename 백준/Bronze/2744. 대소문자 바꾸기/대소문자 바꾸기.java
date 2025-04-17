import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] charArray = br.readLine().toCharArray();
        for (char c : charArray) {
            if (c < 97){
                bw.write(c + 32);
            } else {
                bw.write(c - 32);
            }
        }
        bw.close();
    }
}