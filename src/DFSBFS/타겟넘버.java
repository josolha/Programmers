package DFSBFS;

public class 타겟넘버 {
    int[] numbers;
    int target;
    int answer;

    void dfs (int index, int sum){
        //1.탈출조건
        if(index ==numbers.length){
            if(sum ==target) answer++;
            return;
        }

        //2.수행동작
        dfs(index +1,sum +numbers[index]);
        dfs(index+1,sum - numbers[index]);

    }

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0,0);

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        타겟넘버 타켓넘버 = new 타겟넘버();
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        타켓넘버.solution(numbers,target);
    }
}
