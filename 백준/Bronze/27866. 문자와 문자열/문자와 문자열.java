import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int index = Integer.parseInt(br.readLine()) - 1;
        char c = S.charAt(index);
        bw.write(c);
        bw.close();
    }
}
