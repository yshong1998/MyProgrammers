class Solution {
    public int solution(String num_str) {
        int sum = 0;
        String[] str = num_str.split("");
        for (int i = 0; i < str.length; i++){
            sum += Integer.parseInt(str[i]);
        }
        return sum;
    }
}