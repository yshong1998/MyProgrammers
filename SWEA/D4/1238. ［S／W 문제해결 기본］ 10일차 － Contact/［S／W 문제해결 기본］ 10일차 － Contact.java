import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

	static final int INF = Integer.MAX_VALUE;
	static int V, start, maxValue, maxKey; // 정점의 갯수, 시작 지점
	static HashMap<Integer, List<Integer>> adj; // 간선 정보
	static HashMap<Integer, Boolean> visited; // 방문 여부
	static HashMap<Integer, Integer> dist; // 거리, <to, distance>

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int t = 1; t <= 10; t++) {
			String[] input = br.readLine().split(" ");
			V = Integer.parseInt(input[0]);
			start = Integer.parseInt(input[1]);
			maxValue = 0;
			maxKey = 0;
			adj = new HashMap<>();
			visited = new HashMap<>();
			dist = new HashMap<>();
			// 간선 정보 입력받기
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < V / 2; j++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				if (adj.get(from) == null) {
					adj.put(from, new ArrayList<Integer>());
				}
				if (adj.get(to) == null) {
					adj.put(to, new ArrayList<Integer>());
				}
				adj.get(from).add(to);
				visited.put(from, false);
				visited.put(to, false);
				dist.put(from, 0);
				dist.put(to, 0);
			}
			bfs(start);
			dist.forEach((k,v) -> getMax(k,v));
			System.out.println("#" + t + " " + maxKey);
		}
	}
	
	private static void getMax(int k, int v) {
	    if (v > maxValue) { 
	        maxValue = v;
	        maxKey = k;
	    } else if (v == maxValue) {
	        if (k > maxKey) {
	            maxKey = k;
	        }
	    }
	}

	private static void bfs(int start) {
		Deque<Integer> pq = new ArrayDeque<>();

		// 시작 노드까지의 거리는 0으로 초기화
		dist.put(start, 0);
		// 일단 시작 노드 넣기
		visited.put(start, true);
		pq.add(start);
		while (!pq.isEmpty()) {
			// 우선순위 큐에 있는 거 빼기
			int curr = pq.poll();
			List<Integer> adjList = adj.get(curr);
			for (int child : adjList) {
				if (!visited.get(child)) {
					// 가중치가 무조건 1이라서 그냥 1 더한 값으로 넣으면 된다.
					// 가중치가 각각 다른 경우 조건을 걸어야 한다.
					dist.put(child, dist.get(curr) + 1);
					pq.add(child);
					visited.put(child, true);
				}
			}
		}
	}
}
