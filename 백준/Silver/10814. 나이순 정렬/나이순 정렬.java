import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String[] split = br.readLine().split(" ");
            members.add(new Member(Integer.parseInt(split[0]), split[1]));
        }
        members.sort(Comparator.comparingInt(e -> e.age));
        for (Member member : members) {
            bw.write(member.age + " " + member.name + "\n");
        }
        bw.close();
    }
    static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}