import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] read = br.readLine().split(" ");
        int X = Integer.parseInt(read[1]);
        String[] arr = br.readLine().split(" ");

        Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .filter(integer -> integer < X)
                .forEach(integer -> {
                    try {
                        bw.append(String.valueOf(integer)).append(" ");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        bw.close();
    }
}