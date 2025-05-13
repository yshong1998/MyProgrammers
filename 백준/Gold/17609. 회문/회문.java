import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int answer = isPalindrome(str, 0, str.length() - 1, 0);
            bw.write(answer + "\n");
        }
        bw.close();
    }

    public static int isPalindrome(String str, int start, int end, int check){
        if (check >= 2){
            return 2;
        }
        while (start < end){
            if (str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            } else {
                return Math.min(isPalindrome(str, start + 1, end, check + 1), isPalindrome(str, start, end - 1, check + 1));
            }
        }
        return check;
    }
}
