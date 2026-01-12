import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            System.out.println(isVPS(br.readLine().toCharArray()));
        }
        br.close();
    }

    private static String isVPS(char[] arr){
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '('){
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty()){
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}