import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> sum = new HashSet<>();
        int k;
        for(int i = 0; i< numbers.length; i++){
            for(int j = i+1; j< numbers.length; j++){
                k = numbers[i] + numbers[j];
                sum.add(k);
            }
        }
        int[] answer = new int[sum.size()];
        Integer[] array = sum.toArray(new Integer[sum.size()]);
        for(int i = 0; i< answer.length; i++){
            answer[i] = array[i];
        }
        Arrays.sort(array);
        return array;
    }
}