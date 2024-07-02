package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그림 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[][] map;
    static boolean[][] visited;

    static int height;
    static int width;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());

        map = new int[height][width];
        visited = new boolean[height][width];

        for (int i = 0; i < height; i++) {
            map[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        System.out.println("Arrays.deepToString(map) = " + Arrays.deepToString(map));

        int x = 0;
        int y = 0;

        dfs(x,y);
        bfs(x,y);

    }
    public static int dfs(int x, int y){
        visited[x][y] = true;
        int area =1;
        for (int i = 0; i < 4 ; i++) {
            int nx = x + dx[x];
            int ny= y + dx[y];
            if(nx >=0 && nx < height && ny >=0 && ny <width){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    area += dfs(nx,ny);
                }
            }
        }
        return area;
    }
    public static int bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        int area = 0;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            area++;

            for (int i = 0; i <4 ; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && nx < height && ny >= 0 && ny < width && map[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx,ny});
                    visited[x][y] =true;
                }
            }
        }
        return area;
    }


}
