import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
        System.out.println(Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
        System.out.println(Integer.parseInt(s[0]) * Integer.parseInt(s[1]));
        System.out.println(Integer.parseInt(s[0]) / Integer.parseInt(s[1]));
        System.out.println(Integer.parseInt(s[0]) % Integer.parseInt(s[1]));
    }
}