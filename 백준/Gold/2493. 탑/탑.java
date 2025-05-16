import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int[] arr = new int[cnt];
        Stack<Tower> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty()){
                if (stack.peek().height >= arr[i]){
                    bw.write((stack.peek().index + 1) + " ");
                    break;
                }
                stack.pop();
            }
            if (stack.isEmpty()){
                bw.write(0 + " ");
            }
            stack.push(new Tower(i, arr[i]));
        }
        bw.close();
    }

    public static class Tower {

        int height;
        int index;

        public Tower(int index, int height) {
            this.height = height;
            this.index = index;
        }
    }
}
