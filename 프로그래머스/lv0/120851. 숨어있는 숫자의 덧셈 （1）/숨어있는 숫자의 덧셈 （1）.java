class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] s = my_string.split("");
        for (int i = 0; i < s.length; i++) {
            answer += Integer.parseInt(s[i]);
        }
        return answer;
    }
}