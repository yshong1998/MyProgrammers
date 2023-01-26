class Solution {
    public int[] solution(String s) {
        String[] splitString = s.split("");
        int[] answer = new int[splitString.length];
        for (int i = splitString.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (splitString[i].equals(splitString[j])) {
                    answer[i] = (i - j);
                    break;
                }
                answer[i] = -1;
            }
        }
        answer[0] = -1;
        return answer;
    }
}
