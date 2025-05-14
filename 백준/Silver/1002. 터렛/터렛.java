import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (distance == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (Math.abs(r1 - r2) == distance || r1 + r2 == distance) {
                System.out.println(1);
            } else if (Math.abs(r1 - r2) < distance && distance < (r1 + r2)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }
}
