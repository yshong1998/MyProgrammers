import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정점의 갯수는 10이라고 주어졌다.
        int V = 10;
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int A = input[0];
        int B = input[1];
        int C = input[2];
        List<Integer>[] adjList = new ArrayList[V + 1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }
        if (A == 0){
            double k = C / (double) B;
            if (k == Math.floor(k)){
                for (int i = 1; i < adjList.length ; i++) {
                    adjList[i].add((int) k);
                }
            } else {
                for (int i = 1; i < adjList.length ; i++) {
                    adjList[i].add(0);
                }
            }
        } else if (B == 0){
            double k = C / (double) A;
            if (k == Math.floor(k)){
                for (int i = 1; i < adjList.length; i++) {
                    adjList[(int)k].add(i);
                }
            } else {
                for (int i = 1; i < adjList.length; i++) {
                    adjList[i].add(0);
                }
            }
        } else {
            for (int x = 1; x <= 10; x++) {
                double y = (C - A * x) / (double) B;
                if (y <= 0 || y > 10){
                    continue;
                }
                if (y == Math.floor(y)) {
                    adjList[x].add((int) y);
                }
            }
        }

        for (int i = 1; i < adjList.length; i++) {
            if (adjList[i].size() == 0){
                adjList[i].add(0);
            }
        }
        for (int i = 1; i < adjList.length; i++) {
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.print(adjList[i].get(j) + " ");
            }
            System.out.println();
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}