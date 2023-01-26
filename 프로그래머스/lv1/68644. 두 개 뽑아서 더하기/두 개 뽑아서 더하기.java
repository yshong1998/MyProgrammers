import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

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
        System.out.println(Arrays.toString(array));
        for(int i = 0; i< answer.length; i++){
            answer[i] = array[i];
        }

        Arrays.sort(answer);



        return answer;
    }
}