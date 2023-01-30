import java.util.Arrays;

class Solution {
    public static int[] solution(String my_string) {

        my_string = my_string.replaceAll("[a-zA-Z]","");
        String[] stringArray = my_string.split("");
        int[] answer = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            answer[i] = Integer.parseInt(stringArray[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}