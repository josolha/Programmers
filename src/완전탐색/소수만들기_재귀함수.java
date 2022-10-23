package 완전탐색;

import java.util.HashSet;

public class 소수만들기_재귀함수 {
    HashSet<Integer> hs = new HashSet<>();
    public void recursive(int comb,int[] nums){

        if(comb!=0) {
            hs.add(comb);
        }
        for (int i = 0; i < nums.length ; i++) { // 1,2,3,4
//            recursive(comb+nums[i],nums[i]);
        }
    }

    public int solution(int[] nums) {
        int answer = -1;

        recursive(0,nums);

        return answer;
    }
    public static void main(String[] args) {
        소수만들기_재귀함수 sl = new 소수만들기_재귀함수();
        int[] nums = {1,2,3,4};
        sl.solution(nums);
    }
}
