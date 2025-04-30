import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private static class Point {
        public final long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // 교점 좌표 구하기 메서드
    private Point intersection(int[] first, int[] second) {
        double x = (double) (((long) first[1] * second[2]) - ((long) first[2] * second[1])) / (((long) first[0] * second[1]) - ((long) first[1] * second[0]));
        double y = (double) (((long) first[2] * second[0]) - ((long) first[0] * second[2])) / (((long) first[0] * second[1]) - ((long) first[1] * second[0]));
        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        return new Point((long) x, (long) y); // 정수 좌표만 저장
    }

    // 저장된 정수들에 대해 x,y 좌표와 최댓값, 최솟값 구하기
    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        for (Point point : points) {
            if (point.x > x) x = point.x;
            if (point.y > y) y = point.y;
        }
        return new Point(x,y);
    }

    // 최솟값 구하기
    private Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        for (Point point : points) {
            if (point.x < x) x = point.x;
            if (point.y < y) y = point.y;
        }
        return new Point(x,y);
    }

    /**
     * 1. 모든 직선 쌍에 대해 반복
     * A. 교점 좌표 구하기
     * B. 정수 좌표만 저장
     * 2. 저장된 정수들에 대해 x,y 좌표와 최댓값, 최솟값 구하기
     * 3. 구한 최댓값, 최솟값을 이용하여 2차원 배열의 크기 결정
     * 4. 2차원 배열에 별 표시
     * 5. 문자열 배열로 변환 후 반환
     */
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        // 1. 모든 직선 쌍에 대해 반복
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                // A. 교점 좌표 구하기
                Point intersection = intersection(line[i], line[j]);
                if (intersection != null) {
                    // B. 정수 좌표만 저장
                    points.add(intersection);
                }
            }
        }
        // 2. x,y 좌표의 최댓값, 최솟값 구하기
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);
        // 3. 구한 최댓값, 최솟값을 이용하여 2차원 배열의 크기 결정
        int width = (int)(maximum.x - minimum.x + 1); // 1을 더하는 이유 : 최솟값 '이상' 최댓값 '이하, 이상과 이하의 개수 구하기는 마지막에 1 더하기 하는 원리
        int height = (int)(maximum.y - minimum.y + 1);
        char[][] matrix = new char[height][width];
        for (char[] row : matrix) {
            Arrays.fill(row, '.');
        }
        // 2차원 배열에 별 표시, 주의할 점으로 좌표계와 (0,0) 축의 위치와 y축의 증감이 다른 것을 반영해야 한다.
        for (Point point : points) {
            // x는 가장 좌측이 0이고 오른쪽으로 갈수록 x가 증가하는 형태이기 때문에 기존의 좌표계와 x축 증감이 동일하게 이루어지므로 똑같이 계산
            int x = (int)(point.x - minimum.x);
            // y는 가장 상단이 0이고 하단으로 갈수록 y가 증가하는 형태이기 때문에 기존의 좌표계와 y축 증감이 반대로 이루어지기 때문에 반대로 계산
            int y = (int)(maximum.y - point.y);
            matrix[y][x] = '*';
        }
        // 문자열 배열로 변환 후 반환
        String[] answer = new String[matrix.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(matrix[i]); // new String의 매개변수로는 char Array가 들어오면 이들을 하나로 이은 문자열이 된다
        }
        return answer;
    }
}