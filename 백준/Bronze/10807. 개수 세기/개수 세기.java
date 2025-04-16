import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String[] read = br.readLine().split(" ");
        String target = br.readLine();
        long count = Arrays.stream(read).mapToInt(Integer::parseInt).filter(x -> x == Integer.parseInt(target)).count();
        bw.write(String.valueOf(count));

        bw.close();
    }
}