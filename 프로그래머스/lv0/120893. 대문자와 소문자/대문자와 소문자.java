
class Solution {
    public static String solution(String my_string) {
        StringBuilder stringBuilder = new StringBuilder();
        char ch;
        for (int i = 0; i < my_string.length(); i++) {
            ch = my_string.charAt(i);
            if(ch >= 65 && ch <= 90){
                stringBuilder.append((char)(ch + 32));
            } else if (ch >= 97 && ch <= 122){
                stringBuilder.append((char) (ch - 32));
            }
        }
        return stringBuilder.toString();
    }
}