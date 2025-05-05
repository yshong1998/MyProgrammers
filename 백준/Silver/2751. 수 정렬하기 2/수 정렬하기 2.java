import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<>();
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            int number = Integer.parseInt(br.readLine());
            arr.add(number);
        }
        Collections.sort(arr);
        for (Integer i : arr) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        bw.close();
    }
}
