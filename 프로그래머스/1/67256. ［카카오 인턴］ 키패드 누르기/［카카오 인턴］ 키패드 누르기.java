import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        Map<Integer, Position> map = new HashMap<>();
        map.put(1, new Position(0,0));
        map.put(2, new Position(0,1));
        map.put(3, new Position(0,2));
        map.put(4, new Position(1,0));
        map.put(5, new Position(1,1));
        map.put(6, new Position(1,2));
        map.put(7, new Position(2,0));
        map.put(8, new Position(2,1));
        map.put(9, new Position(2,2));
        map.put(0, new Position(3,1));
        Position left = new Position(3, 0);
        Position right = new Position(3, 2);
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = map.get(numbers[i]);
                sb.append("L");
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                right = map.get(numbers[i]);
                sb.append("R");
            } else {
                Position target = map.get(numbers[i]);
                int leftDist = Math.abs(left.x - target.x) + Math.abs(left.y  - target.y);
                int rightDist = Math.abs(right.x - target.x) + Math.abs(right.y  - target.y);
                if(leftDist < rightDist) {
                    left = target;
                    sb.append("L");
                } else if(leftDist > rightDist) {
                    right = target;
                    sb.append("R");
                } else {
                    if(hand.equals("left")) {
                        left = target;
                        sb.append("L");
                    } else {
                        right = target;
                        sb.append("R");
                    }
                }
            }
            answer = sb.toString();
        }
        System.out.println(answer);
        return answer;
    }

    class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}