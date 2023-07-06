package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_연결요소의개수구하기 {

    /*
        제한 시간 : 3초
        노드의 개수 1,000  -> N제곱은 백만 3초는 무난하다.
        따라서 N제곱 이하 알고리즙을 모두 사용할 수 있다.
     */

    static boolean[] visited;
    static ArrayList<Integer>[] A;


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //0번을 사용하지 않음 헷갈려서
        visited = new boolean[n+1];

        A = new ArrayList[n+1];

        for (int i = 1; i < n+1 ; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            //아직 방향성이 없다.

            A[s].add(e);
            A[e].add(s);


        }
        int count = 0;

        for (int i = 1; i < n+1; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }

        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;

        for (int i : A[v]) {
            if(!visited[i]){
                DFS(i);
            }

        }


    }
}
