class Solution {
    public StringBuffer solution(String my_string, int num1, int num2) {
        StringBuffer answer = new StringBuffer();
        char tmp;
        char[] charArray = my_string.toCharArray();
        tmp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = tmp;
        for (int i = 0; i < my_string.length(); i++) {
            answer.append(charArray[i]);
        }
        return answer;
    }
}
