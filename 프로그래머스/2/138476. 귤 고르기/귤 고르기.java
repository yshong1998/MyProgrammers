import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 귤의 크기 - 중복된 귤의 갯수 map
        Map<Integer, Integer> tangerineMap = new HashMap<>();
        for (int size : tangerine) {
            if (tangerineMap.containsKey(size)) {
                tangerineMap.put(size, tangerineMap.get(size) + 1);
            } else {
                tangerineMap.put(size, 1);
            }
        }
        List<Entry<Integer, Integer>> collect = tangerineMap.entrySet().stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
        Map<Integer,Integer> sortedTangerineMap = new LinkedHashMap<>();
        for (Entry<Integer, Integer> sortedEntry : collect) {
            sortedTangerineMap.put(sortedEntry.getKey(), sortedEntry.getValue());
        }
        int sum = 0;
        int minCnt = 0;
        for (Integer integer : sortedTangerineMap.keySet()) {
            sum += sortedTangerineMap.get(integer);
            minCnt++;
            if (sum >= k){
                break;
            }
        }
        return minCnt;
    }
}