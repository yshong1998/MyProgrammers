class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if((s.length() == 4 || s.length() == 6) && (checkElementsOnlyNumbers(s))){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public boolean checkElementsOnlyNumbers(String s){
        try {
            Integer.parseInt(s);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}