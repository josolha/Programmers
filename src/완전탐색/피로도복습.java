package 완전탐색;

public class 피로도복습 {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        피로도복습_Solution 피로도 = new 피로도복습_Solution();
        System.out.println(피로도.solution(k,dungeons));
    }
}
class 피로도복습_Solution {

    int answer = 0;
    int[][] dungeons;
    boolean[] visited;

    int k;

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        this.k = k;
        this.visited = new boolean[dungeons.length];
        recursive(k,0);
        return answer;
    }

    private void recursive(int k,int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                recursive(k - dungeons[i][1],cnt+1);
                visited[i] =false;
            }
        }
        answer = Math.max(answer,cnt);

        System.out.printf("{}",123);
    }
}