import java.util.ArrayList;
import java.util.List;

class Solution {
    public static StringBuilder solution(int age) {
        List<Character> ch = new ArrayList<>();
        while (age != 0){
            ch.add((char)((age%10)+97));
            age/=10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = ch.size()-1; i >= 0; i--) {
            sb.append(ch.get(i));
        }

        return sb;
    }
}
