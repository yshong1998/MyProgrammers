package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DFSSearch {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        // 1. 트리 형태의 데이터 만들기
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));
        // 트리에 대해 BFS 수행하기
        System.out.println(dfsFunc(graph, "A"));
    }

    public static ArrayList<String> dfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        // 방문한 노드를 저장할 리스트, 원래는 Queue다
        ArrayList<String> visited = new ArrayList<>();
        // 방문예정인 노드를 저장할 리스트, 원래는 Stack이다.
        ArrayList<String> needVisit = new ArrayList<>();
        // 첫 노드 삽입
        needVisit.add(startNode);
        while(!needVisit.isEmpty()) {
            // needVisit은 스택이므로, last-in인 요소를 first-out 해 준다.
            // BFS와 다른점은 여기밖에 없다. Queue가 아닌 Stack이 되었다는 점
            String node = needVisit.remove(needVisit.size() - 1);
            // 꺼낸 노드가 방문한 적 없는 노드라면
            if (!visited.contains(node)) {
                // 방문처리
                visited.add(node);
                // 해당 노드의 자식들을 stack에 넣기
                // 같은 depth의 다른 노드들보다 해당 노드의 자식들이 나중에 들어오게 된 상황
                // last-out이므로 자식들이 먼저, 그 중에서도 오른쪽 자식들이 먼저 탐색되게 된다.
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }
}
