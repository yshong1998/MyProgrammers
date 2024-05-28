class Solution {
    public int solution(String my_string, String is_prefix) {
        boolean answer = my_string.startsWith(is_prefix);
        if (answer){
            return 1;
        }
        return 0;
    }
}