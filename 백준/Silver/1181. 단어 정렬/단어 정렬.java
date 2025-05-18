import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < cnt; i++) {
            set.add(br.readLine());
        }
        List<String> answerList = set.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }
                for (int i = 0; i < Math.max(o1.length(), o2.length()); i++) {
                    char c1 = o1.charAt(i);
                    char c2 = o2.charAt(i);
                    if (c1 > c2) {
                        return 1;
                    } else if (c1 < c2) {
                        return -1;
                    }
                }
                return 0;
            }
        }).map(String::toString).collect(Collectors.toList());
        for (String s : answerList) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}