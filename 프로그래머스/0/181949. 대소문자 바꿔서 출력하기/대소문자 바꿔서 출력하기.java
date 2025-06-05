import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        a.chars().forEach(c -> {
            sb.append(convert((char) c));
        });
        System.out.println(sb.toString());
    }

    private static char convert(char c){
        if (c >= 'a' && c <= 'z'){
            return (char)(c - 32); // 소문자 → 대문자
        } else if (c >= 'A' && c <= 'Z'){
            return (char)(c + 32); // 대문자 → 소문자
        } else {
            return c; // 알파벳이 아닌 경우 그대로 반환
        }
    }
}