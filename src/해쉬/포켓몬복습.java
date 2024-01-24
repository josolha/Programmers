package 해쉬;

import java.util.HashSet;
import java.util.Map;

public class 포켓몬복습 {
    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        포켓몬복습_Solution sl = new 포켓몬복습_Solution();
        System.out.println(sl.solution(nums));
    }


}
class 포켓몬복습_Solution{

    HashSet<Integer> map = new HashSet<>();
    int answer;
    public int solution(int[] nums){

        for (int num :
                nums) {
            map.add(num);
        }

        return Math.min(map.size(),nums.length);
    }

}
