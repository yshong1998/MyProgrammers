class Solution {
    public static int solution(String s) {
        int answer = 0;
        String[] stringNumbers = {"zero","one", "two", "three", "four", "five","six","seven","eight","nine"};
        for (int i = 0; i < stringNumbers.length; i++) {
            if(s.contains(stringNumbers[i])){
                s = s.replaceAll(stringNumbers[i], String.valueOf(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}