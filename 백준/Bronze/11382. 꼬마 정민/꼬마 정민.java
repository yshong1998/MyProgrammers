import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        System.out.println(Long.parseLong(s[0]) + Long.parseLong(s[1]) + Long.parseLong(s[2]));
    }
}