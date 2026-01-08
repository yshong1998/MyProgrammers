import java.io.*;

public class Main {
    static int mapR;
    static int mapC;
    static char[][] map;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        mapR = Integer.parseInt(s[0]);
        mapC = Integer.parseInt(s[1]);

        map = new char[mapR][mapC];
        for (int i = 0; i < mapR; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int r = 0; r <= mapR - 8; r++) {
            for (int c = 0; c <= mapC - 8; c++) {
                int b = countRepaint(r, c, 'B');
                int w = countRepaint(r, c, 'W');
                min = Math.min(min, Math.min(b, w));
            }
        }

        System.out.println(min);

        br.close();
    }
    private static int countRepaint(int cr, int cc, char start) {
        int cnt = 0;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                char expected = ((r + c) % 2 == 0) ? start : opposite(start);
                if (map[cr + r][cc + c] != expected) cnt++;
            }
        }
        return cnt;
    }

    private static char opposite(char ch) {
        return ch == 'B' ? 'W' : 'B';
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}