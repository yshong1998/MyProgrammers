import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tangerineMap = new HashMap<>();
        for (int size : tangerine) {
            if (tangerineMap.containsKey(size)) {
                tangerineMap.put(size, tangerineMap.get(size) + 1);
            } else {
                tangerineMap.put(size, 1);
            }
        }
        List<Integer> list = new ArrayList<>(tangerineMap.keySet());
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return tangerineMap.get(o2) - tangerineMap.get(o1);
            }
        };
        list.sort(comparator);
        int sum = 0;
        for (Integer key : list) {
            sum += tangerineMap.get(key);
            answer++;
            if (sum >= k){
                break;
            }
        }
        return answer;
    }
}