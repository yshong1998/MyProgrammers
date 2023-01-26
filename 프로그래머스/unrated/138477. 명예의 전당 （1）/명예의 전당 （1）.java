import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(hallOfFame.size() < k){
                hallOfFame.add(score[i]);
            } else {
                Integer minScore = getMinScore(hallOfFame);
                hallOfFame.set(hallOfFame.indexOf(minScore), Math.max(minScore,score[i]));
            }
            answer[i] = getMinScore(hallOfFame);
        }
        return answer;
    }

    private Integer getMinScore(List<Integer> hallOfFame) {
        Integer minScore = hallOfFame
                .stream()
                .mapToInt(x -> x)
                .min()
                .orElseThrow(NoSuchElementException::new);
        return minScore;
    }
}