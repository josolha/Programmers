package 백준;

import static 백준.복습.그림.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P17484_진우의달여행 {

    static int[][] map;

    static boolean[][] visited;

    static int[] dx = {1,1,1};
    static int[] dy = {-1,0,1};

    static int height;
    static int weight;

    static int min = Integer.MAX_VALUE; // 최소값을 최대로 초기화

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        height = Integer.parseInt(st.nextToken());
        weight = Integer.parseInt(st.nextToken());

        map = new int[height][weight];
        visited = new boolean[height][weight];

        for (int i = 0; i < height ; i++) {
            map[i]= Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        //System.out.println("Arrays.deepToString(map) = " + Arrays.deepToString(map));
        for (int i = 0; i < weight ; i++) {
            dfs(0,i,-1,0);
        }
        System.out.println(min);

    }
    public static void dfs(int x, int y, int prev, int sum){
        if(x == height -1) {
            min = Math.min(min, sum + map[x][y]);
            return;
        }
        for (int i = 0; i < 3; i++) {
            if(prev == i){
                continue;
            }
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < height && ny >= 0 && ny < weight) { // 범위 검사
                dfs(nx, ny, i, sum + map[x][y]);
            }
        }

    }
}
