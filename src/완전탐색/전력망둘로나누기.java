package 완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 전력망둘로나누기 {
    public static void main(String[] args) {
        int n = 9;
        int[][] wires = new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

        전력망둘로나누기_Solution sl = new 전력망둘로나누기_Solution();
        System.out.println(sl.solution(n, wires));


    }
}
class 전력망둘로나누기_Solution{
    List<List<Integer>> graph = new ArrayList<>();

    int[][] wires;
    int n;

    int answer = 0;
    boolean[] visited ;


    public int solution(int n, int[][] wires) {
        this.n = n;
        this.wires = wires;
        this.visited = new boolean[n+1];

        for (int i = 0; i <= n ; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] wire: wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        int minDifference = Integer.MAX_VALUE;
        for (int[] wire : wires) {
            // 해당 wire를 제거
            graph.get(wire[0]).remove(Integer.valueOf(wire[1]));
            graph.get(wire[1]).remove(Integer.valueOf(wire[0]));

            // 첫 번째 전력망 크기 계산
            Arrays.fill(visited, false);
            int sizeFirst = dfsSize(wire[0]);

            // 두 번째 전력망 크기 계산
            Arrays.fill(visited, false);
            int sizeSecond = dfsSize(wire[1]);

            // 두 전력망의 크기 차이 계산
            int difference = Math.abs(sizeFirst - sizeSecond);
            minDifference = Math.min(minDifference, difference);

            // 제거했던 wire 복원
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        return minDifference;
    }

    private void dfs(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        answer++;

        for (int adj : graph.get(v)){
            if(!visited[adj]){
                dfs(adj);
            }
        }
    }
    private int dfsSize(int v) {
        if (visited[v]) {
            return 0;
        }
        visited[v] = true;
        int size = 1;

        for (int adj : graph.get(v)) {
            if (!visited[adj]) {
                size += dfsSize(adj);
            }
        }
        return size;
    }
}
