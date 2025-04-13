import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        System.out.println(Double.parseDouble(s[0]) / Double.parseDouble(s[1]));
    }
}