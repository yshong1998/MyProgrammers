class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(int) Math.ceil(names.length / 5.0)];
        System.out.println(answer.length);
        for(int i = 0; i < answer.length; i++){
            answer[i] = names[5 * i];
        }
        return answer;
    }
}