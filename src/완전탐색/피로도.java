package 완전탐색;

public class 피로도 {

    public static void main(String[] args) {

     int k = 80;
     int[][] dungeons = {{80,20},{50,40},{30,10}};

        피로도_Solution 피로도 = new 피로도_Solution();
        System.out.println(피로도.solution(k,dungeons));

    }
}
class 피로도_Solution{
    int k;


    int[][] dungeons;
    int answer =0;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        this.k = k;
        this.dungeons = dungeons;
        this.visited = new boolean[dungeons.length];
        dfs(k,0);
        return answer;
    }


    private void dfs(int k, int cnt) {
        for (int j = 0; j < dungeons.length; j++) {
            if(k - dungeons[j][0] >= 0){
                dfs(k - dungeons[j][1], cnt+1);
            }
        }
        answer =Math.max(answer,cnt);
    }

}
