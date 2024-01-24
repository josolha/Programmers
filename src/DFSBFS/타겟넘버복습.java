package DFSBFS;




public class 타겟넘버복습 {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        Solution sl = new Solution();
        int answer =sl.solution(numbers,target);
        System.out.println("answer = " + answer);
    }
}
class Solution{
    int[] numbers;
    int target;
    int answer;

    public int solution(int[] numbers, int target){
        this.numbers = numbers;
        this.target = target;
        this.answer =0;

        dfs(0,0);
        return answer;
    }

    private void dfs(int index, int sum) {
        if(index == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        dfs(index+1, sum+numbers[index]);
        dfs(index+1, sum-numbers[index]);
    }
}

