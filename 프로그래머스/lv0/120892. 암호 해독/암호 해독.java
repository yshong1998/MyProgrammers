class Solution {
    public static String solution(String cipher, int code) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; code * i <= cipher.length(); i++) {
            stringBuilder.append(cipher.charAt(code * i-1));
        }
        answer = stringBuilder.toString();
        return answer;
    }
}