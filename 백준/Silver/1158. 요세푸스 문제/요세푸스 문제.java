import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String result = printJosephus(arr[0], arr[1]);
        bw.write(result);
        bw.close();
    }

    /**
     * 7, 3
     * case     arr
     * 1        1 2 3 4 5 6 7 -> 3 제거
     * 2        1 2 4 5 6 7 -> 6 제거
     * 3        1 2 4 5 7 -> 2 제거
     * 4        1 4 5 7 -> 7 제거
     * 5        1 4 5 -> 5 제거
     * 6        1 4 -> 1 제거
     * 7        4 -> 4 제거
     */

    public static String printJosephus(int n, int k){
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        StringBuilder result = new StringBuilder();
        result.append("<");
        int index = 0;
        for (int i = 0; i < n; i++) {
            index = (index + k - 1) % list.size();
            result.append(list.remove(index)).append(", ");
        }
        result.delete(result.length()-2, result.length());
        result.append(">");
        return result.toString();
    }
}
