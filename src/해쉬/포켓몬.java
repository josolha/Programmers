package 해쉬;

import java.util.HashMap;
import java.util.HashSet;

public class 포켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        Solution sol = new Solution();
        sol.solution(nums);
    }
}
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }
        answer = Math.min(hashSet.size(),nums.length/2);

        return answer;
    }
}
