import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.lines().forEach(line -> {
            try {
                bw.write(line);
                bw.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.close();
    }
}
