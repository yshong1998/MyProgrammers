import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String target = "";
        while (st.hasMoreTokens()) {
            target = st.nextToken();
        }
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (arr[c - 97] == -1) {
                arr[c - 97] = i;
            }
        }

        for (int i : arr) {
            bw.write(i + " ");
        }

        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}