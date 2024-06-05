class Solution {
    static int row = 0;
    static int column = 0;
    static int dangerousArea = 0;
//    static int[][] board = {{0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//            {0, 0, 1, 0, 0},
//            {0, 0, 0, 0, 0}};
//    static int[][] dangerous = {{0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0}};

    void dfs(int[][] board, int[][] dangerous, int row, int column) {
        // 1. 탈출 조건
        if (row == board.length) {
            return;
        }
        // 1을 만나면 주변 위험 지역 선언
        if (board[row][column] == 1) {
            dangerous[row][column] = 1;
            checkDangerous(dangerous, row, column);
        }
        // 2. 수행 동작
        if (column < board[0].length - 1) {
            dfs(board, dangerous, row, ++column);
        } else {
            column = 0;
            dfs(board, dangerous, ++row, column);
        }
    }

    void checkDangerous(int[][] dangerous, int row, int column) {
        int[] dc = {0, 0, -1, 1, -1, -1, 1, 1}; // 상 / 하 / 좌 / 우 / 좌상 / 좌하 / 우상 / 우하
        int[] dr = {1, -1, 0, 0, 1, -1, 1, -1};
        for (int i = 0; i < dc.length; i++) {
            if (row + dr[i] != dangerous.length && row + dr[i] != -1 && column + dc[i] != dangerous.length
                    && column + dc[i] != -1) {
                dangerous[row + dr[i]][column + dc[i]] = 1;
            }
        }
    }

    public int solution(int[][] board) {
        int answer;
        int[][] dangerous = new int[board.length][board.length];
        dfs(board, dangerous, row, column);
        answer = board.length * board.length;
        for (int i = 0; i < dangerous.length; i++) {
            for (int j = 0; j < dangerous[i].length; j++) {
                if (dangerous[i][j] == 1) {
                    dangerousArea++;
                }
            }
        }
        answer = answer - dangerousArea;
        return answer;
    }
}