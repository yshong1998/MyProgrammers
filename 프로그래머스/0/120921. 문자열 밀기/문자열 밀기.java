class Solution {
    public int solution(String A, String B) {
        int pushCount = 0;
        while (!A.equals(B)){
            pushCount++;
            A = push(A);
            if (pushCount == A.length()){
                return -1;
            }
        }
        return pushCount;
    }
    public String push(String origin){
        return origin.charAt(origin.length() - 1) + origin.substring(0, origin.length() - 1);
    }
}