
class Solution {
    public static String solution(String rsp) {
        //0은 2를 이긴다 2는 5를 이긴다 5는 0을 이긴다
        String answer = "";
        char ch;
        for (int i = 0; i < rsp.length(); i++) {
            ch = rsp.charAt(i);
            if(ch == '2'){
                answer += "0";
            } else if(ch == '0'){
                answer += "5";
            } else if (ch == '5'){
                answer += "2";
            }
        }
        return answer;
    }
}