import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // 1번. array를 command[i][0] -1 부터 command[i][1] -1까지 자른다.
        for (int i = 0; i < commands.length; i++) {
            // copyOfRange 는 from (포함) 부터 to (미포함)까지 복사하기 때문에 3번 인덱스까지 복사하려면 to는 4여야 한다.
            int[] newArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // 2번 잘라서 새로 등장한 배열을 오름차순 정렬한다.
            Arrays.sort(newArray);
            // 3번 정렬한 배열의 command[i][2] -1 번째 숫자를 구한다.
            answer[i] = newArray[commands[i][2] - 1];
        }
        return answer;
    }
}
class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(
                new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));

    }
}