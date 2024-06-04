import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (cntMap.containsKey(array[i])){
                cntMap.put(array[i], cntMap.get(array[i]) + 1);
            } else {
                cntMap.put(array[i], 1);
            }
        }
        int maxCnt = 0;
        Integer maxValue = Collections.max(cntMap.values());
        for (Integer integer : cntMap.keySet()) {
            if (cntMap.get(integer).equals(maxValue)){
                answer = integer;
                maxCnt++;
            }
        }
        if (maxCnt > 1){
            return -1;
        }
        return answer;
    }
}