import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < moves.length; i++) {
            int doll = 0;
            int r = 0;
            while(doll == 0 && r < board.length){
                doll = board[r++][moves[i] - 1];
            }
            if(doll == 0 && r == board.length){
                continue;
            }
            board[r - 1][moves[i] - 1] = 0;
            if(stack.isEmpty()){
                stack.push(doll);
            } else {
                if(stack.peek() == doll){
                    stack.pop();
                    answer+=2;
                } else {
                    stack.push(doll);
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}