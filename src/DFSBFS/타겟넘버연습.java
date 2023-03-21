package DFSBFS;

public class 타겟넘버연습 {
    int[] arr;
    int target;
    int answer;

    public int solution(int[] arr ,int target){
        this.arr = arr;
        this.target = target;

        dfs(0,0);
        return answer;
    }
    void dfs(int a, int b){
        //탈출코드
        if(a == arr.length) {
            if (b == target) {
                answer++;
            }
            return;
        }
        dfs(a+1, b+arr[a]);
        dfs(a+1, b-arr[a]);
    }


    public static void main(String[] args) {

        타겟넘버연습 타겟넘버연습 = new 타겟넘버연습();
        int answer = 타겟넘버연습.solution(new int[]{1,1,1,1,1},3);
        System.out.println(answer);
    }
}
