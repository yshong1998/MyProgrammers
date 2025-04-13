import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        if (A > B){
            System.out.println(">");
        } else if (A == B) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}