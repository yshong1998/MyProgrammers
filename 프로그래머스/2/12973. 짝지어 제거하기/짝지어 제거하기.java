import java.util.Deque;
import java.util.ArrayDeque;
class Solution
{
    public int solution(String s)
    {
        String[] split = s.split("");
        Deque<String> temp = new ArrayDeque<>();
        for (int i = 0; i < split.length; i++) {
            if (!temp.isEmpty() && temp.peek().equals(split[i])){
                temp.pop();
            } else {
                temp.push(split[i]);
            }
        }
        return temp.size() == 0 ? 1 : 0;
    }
}
