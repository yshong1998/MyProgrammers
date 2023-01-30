import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            myMap.put(array[i],i);
        }
        Arrays.sort(array);
        int index = myMap.get(array[array.length-1]);
        answer[0] = array[array.length-1];
        answer[1] = index;
        return answer;
    }
}