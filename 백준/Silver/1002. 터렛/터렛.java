import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int answer = solution(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bw.write(answer + "\n");
        }
        bw.close();
    }

    public static int solution(int x1, int y1, int r1, int x2, int y2, int r2){
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (length == 0 && r1 == r2) return -1; // 동심원 + 반지름이 같음
        else if (length == 0) return 0; // 동심원 + 반지름이 다름
        else if (length == Math.abs(r1 - r2) || length == r1 + r2) return 1; // 내접 || 외접하며 만남
        else if (length > Math.abs(r1 - r2) && length < r1 + r2) return 2; // 두 교점에서 만남
        else return 0; // 만나지 않음
    }
}
