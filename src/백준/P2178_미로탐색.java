package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_미로탐색 {

    //아래,오른쪽,위,왼쪽
    static int[] dx = {0, 1, 0,-1};
    static int[] dy = {1, 0,-1, 0};

    static boolean[][] visited;
    static int[][] A;
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];  //미로 구현 배열 ->  그리고 숫를 계속 바꿔줄꺼임
        visited = new boolean[N][M]; // 방문을 나타내는 배열

        //미로 구현 배열에 넣는 작업
        for (int i = 0; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); // 101101101
            for (int j = 0; j < M ; j++) {
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        Bfs(0,0);
        System.out.println(A[N-1][M-1]);
    }

    private static void Bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            for (int k = 0; k < 4; k++) {  //상하좌우로 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<N && y<M){  // 배열을 넘어가면 안되고
                    if (A[x][y]!= 0 && !visited[x][y]) { //0이여서 갈수 없거나 기방문한 곳이면 안됌
                        //이제 갈수 있는 곳이다.
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;// 핵심
                        queue.add(new int[] {x,y});  //다음에 방문할 셀의 위치
                    }
                }
            }
        }
    }
}
