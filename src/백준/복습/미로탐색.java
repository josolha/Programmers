package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import 백준.BufferReader;

public class 미로탐색 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int [][] A;
    static int N,M;

    //DFS ,  BFS 둘다 풀수 있음.
    //DFS로 한다면 자기 인덱스를 갖고 가야함.(의오로 까다라움)
    //BFS는 왜 간단하냐 -> 처음으로 도착하는 순간 최솟값이라서
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i <N ; i++) {
            st=new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M ; j++) { //1011010101
                A[i][j]= Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[]{i,j});

        while(!queue.isEmpty()){
            int now[] = queue.poll();
            visited[i][j] = true;

            for (int k = 0; k < 4; k++) { //상하좌우로 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if(x>=0 && y >= 0 && x <N && y<M){ //배열을 넘어가면 안되고
                    if(A[x][y]!=0 && !visited[x][y]){ //0이여서 갈수없거나 기방분한 곳이면 안됨
                        //이제 갈수 있는 곳이다.
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1; // 핵심
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
