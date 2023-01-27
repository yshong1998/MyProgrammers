class Solution {
    public static String solution(String s) {
        String answer = "";
        s = s.toUpperCase();
        char[] charArray = s.toCharArray();
        for (int i = 0 ,k = 0; i < s.length(); i++) {
            if(charArray[i] == 32){
                k=0;
                answer += charArray[i];
                continue;
            }
            if(k % 2 == 0){
                answer += charArray[i];
            } else {
                answer += (char)(charArray[i] + 32);
            }
            k++;
        }
        return answer;
    }
}