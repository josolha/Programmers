package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리복습 {

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

        게임맵최단거리복습_Solution sl = new 게임맵최단거리복습_Solution();
        System.out.println(sl.solution(maps));
    }

}

class 게임맵최단거리복습_Solution{
    int answer;

    //지도
    int[][] maps;

    //방문 배열
    boolean[][] visited;

    //방향
    int[] dx = {0,0,-1,1};
    int[] dy = {-1,1,0,0};


    public int solution(int[][] maps){
        answer=0;
        this.maps = maps;
        visited = new boolean[maps.length][maps[0].length];

        bfs(0,0);
        int answer = maps[maps.length-1][maps[0].length-1];

        return (answer > 1) ? answer : -1;
    }

    private void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j] = true;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                break;
            }
            for (int k = 0; k <4 ; k++) {
                int goX = dx[k] + x;
                int goY = dy[k] + y;
                if(goX>=0 && goY>=0 &&  goX < maps.length && goY< maps[0].length){
                    if(!visited[goX][goY] && maps[goX][goY] !=0){
                        queue.add(new int[]{goX,goY});
                        visited[goX][goY] = true;
                        maps[goX][goY] = maps[x][y]+1;
                    }
                }
            }
        }
    }
}