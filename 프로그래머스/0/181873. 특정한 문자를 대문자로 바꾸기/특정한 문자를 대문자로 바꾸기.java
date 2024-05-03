class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] split = my_string.split("");
        for (int i = 0; i < split.length; i++){
            if (split[i].equals(alp)){
                split[i] = split[i].toUpperCase();
            }
            answer += split[i];
        }
        return answer;
    }
}