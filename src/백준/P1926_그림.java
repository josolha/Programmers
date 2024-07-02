package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1926_그림 {

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

        int maxArea =0;
        int cnt = 0;
        long startTime, endTime;


        startTime = System.nanoTime();
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width ; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    maxArea = Math.max(maxArea,dfs(i,j));
                    //maxArea = Math.max(maxArea,bfs(i,j));
                }
            }
        }
        endTime = System.nanoTime();
        System.out.println("측정시간은 : "+ (endTime - startTime) + " ms");

        //dfs(0,0);

//        System.out.println("Arrays.deepToString(map) = " + Arrays.deepToString(map));
//        System.out.println("Arrays.deepToString(visited) = " + Arrays.deepToString(visited));

        System.out.println("cnt = " + cnt);
        System.out.println("maxArea = " + maxArea);
    }

    private static int dfs(int x, int y) {
        visited[x][y] = true;
        int area = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < height && ny >= 0 && ny < width) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    area += dfs(nx, ny);
                }
            }
        }
        System.out.println("area = " + area);
        return area;
    }


    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        int area = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            area++;

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && nx < height && ny >= 0 && ny < width && map[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }

        return area;
    }
}
