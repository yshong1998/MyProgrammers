import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int F, S, G, U, D;
	static boolean[] visited;

	static int[] ud;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		F = sc.nextInt(); // 총 층 수
		S = sc.nextInt(); // 현재 위치
		G = sc.nextInt(); // 도착지
		U = sc.nextInt(); // 위로 이동 층 수
		D = sc.nextInt(); // 아래로 이동 층 수
		
		ud = new int[] { U, -D };
		visited = new boolean[F + 1];
		
		if (S == G) {
		    System.out.println(0);
		    return;
		}
		
		bfs(S); // 시작층

	}// main

	private static void bfs(int x) {
		
		Queue<int[]> queue = new ArrayDeque<>(); //현재위치, 이동횟수 저장
		
		visited[x] = true; //시작점 방문처리
		queue.offer(new int[] {x, 0}); // 큐에 넣기

		while (!queue.isEmpty()) { // 큐가 빌 때까지 반복
			int[] curr = queue.poll(); // 현재 위치

			for (int i = 0; i < 2; i++) {
				int newPos = curr[0] + ud[i];

				if (newPos == G) { //도착지라면
					System.out.println(curr[1] + 1);
					return;
				}
				
				if (newPos < 1 || newPos > F) continue; // 범위 밖이니?
				if (visited[newPos]) continue; // 방문한 적이 있니?
				

				visited[newPos] = true; // 방문처리
				queue.offer(new int[] {newPos, curr[1] + 1}); //큐에 넣기
			}

		} //end while
		
		System.out.println("use the stairs");
	}
}
