import java.io.*;
import java.util.*;

public class Main {
    static int visitOrder;
    static int[] result;
    static boolean[] visited;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = input[0];
        int M = input[1];
        int R = input[2];
        visitOrder = 1;
        result = new int[N + 1];
        visited = new boolean[N + 1];
        // 인접 리스트로 그래프 표현
        // 그래프의 인덱스 = 정점. 1번 인덱스 = 정점 1과 같다.
        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 양방향 그래프 구성
        for (int i = 0; i < M; i++) {
            String[] E = br.readLine().split(" ");
            int u = Integer.parseInt(E[0]);
            int v = Integer.parseInt(E[1]);
            graph[u].add(v);
            graph[v].add(u);  // 양방향 연결
        }

        // 각 정점의 인접 정점들을 오름차순 정렬 - 문제 요구 사항이 오름차순이므로
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(graph, R);

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.println(result[i]);
        }

        br.close();
    }

    // 재귀적 DFS 구현
    public static void dfs(List<Integer>[] graph, int node) {
        visited[node] = true;
        result[node] = visitOrder++;

        // 인접 정점들을 오름차순으로 방문 (이미 정렬됨)
        // node = 인덱스 = 정점이다.
        // neighbor = 해당 정점과 연결된 정점들
        // 그 정점들을 방문한 적이 없다면
        // 그 노드로 다시 이동해라
        // 그러면 위 코드로 다시 돌아오게 되고, 이동한 노드의 방문 여부는 true가 되고 방문순서가 저장된다.
        // 다음에 그 노드와 연결된 노드들 중에서 방문한 적 없는 노드를 다시 찾는다.
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}