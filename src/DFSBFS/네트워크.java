package DFSBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 네트워크 {

    public static void main(String[] args) {

        int[][] arr = {{1,1,0},{1,1,1},{0,1,1}};
        int n = 3;

        네트워크_Solution sl = new 네트워크_Solution();
        System.out.println(sl.solution(n,arr));
    }
}
class 네트워크_Solution {

    boolean[] visited;
    int[][] computers;
    List<Integer>[] map;
    int answer;
    int n;

    public int solution(int n, int[][] computers) {
        answer = 0;
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        map = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }
                if(computers[i][j]==1){
                    map[i].add(j);
                }
            }
        }
        System.out.println(Arrays.deepToString(map));
        System.out.println(Arrays.toString(visited));

        for (int i = 0; i <n ; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i);
            }
        }
        return answer;
    }
    private void dfs(int v) {
        if(visited[v]){
            return;
        }
        visited[v] =true;
        for (int i: map[v]) {
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}





