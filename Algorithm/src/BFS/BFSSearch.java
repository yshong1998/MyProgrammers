package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFSSearch {
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
        System.out.println(bfsFunc(graph, "A"));
    }

    public static ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<>(); // 방문한 노드, 즉 탐색을 수행한 노드가 저장된 Queue
        ArrayList<String> needVisit = new ArrayList<>();//방문한 노드와 연결되어 있던 노드로 이제 순서대로 방문해야 하는 노드
        needVisit.add(startNode); // 일단 시작 노드를 넣는다. 방문해야 하는 노드로 넣는다.
        // 더 이상 방문해야 하는 노드가 없을 때까지 반복, 처음에는 startNode가 있다.
        while (!needVisit.isEmpty()) {
            // 가장 앞에 있는 노드를 꺼낸다.
            String node = needVisit.remove(0);
            // 꺼낸 노드가 추가로 방문해야 하는 노드, 즉 자식 노드들을 갖고 있다면
            // 이들을 needVisit 큐에 등록한다.
            if (!visited.contains(node)) {
                // 일단 꺼낸 노드는 방문한 것이므로 방문큐에 넣는다.
                visited.add(node);
                // 꺼낸 노드의 자식 노드들을 방문 대기 큐에 넣는다.
                // 같은 depth의 노드들이 왼쪽부터 순서대로 삽입되게 된다.
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }
}
