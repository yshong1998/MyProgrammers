class Solution {
    /**
     * food	            result
     * [1, 3, 4, 6]	    "1223330333221" -> 0번 1개 (물) / 1번 3개 / 2번 4개 / 3번 6개
     * [1, 7, 1, 2]	    "111303111"
     * 칼로리가 가장 높은 것을 0의 좌우에 갯수 / 2개만큼씩 배치
     * 그 다음 칼로리가 높은 것을 갯수 / 2개만큼씩 배치
     * 반복
     */
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder("0");
        for (int i = food.length - 1; i > 0; i--) {
            int repeatCount = food[i] / 2;
            String repeat = String.valueOf(i).repeat(repeatCount);
            answer.insert(0,repeat).append(repeat);
        }
        return answer.toString();
    }
}