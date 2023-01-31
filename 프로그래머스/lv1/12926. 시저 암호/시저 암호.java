class Solution {
    public static StringBuilder solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ((ch >= 65 && ch <= 90)) {
                ch += n;
                if (ch> 90) {
                    ch = (char)(ch- 26);
                }
            } else if (ch >= 97 && ch <= 122) {
                ch += n;
                if (ch > 122) {
                    ch = (char)(ch - 26);
                }
            }
            sb.append(ch);
        }
        return sb;
    }
}