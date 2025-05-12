import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        int M = Integer.parseInt(split[0]);
        int N = Integer.parseInt(split[1]);
        for (int i = M; i <= N; i++) {
            if (isDecimal(i)) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.close();
        br.close();
    }

    public static boolean isDecimal (int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}