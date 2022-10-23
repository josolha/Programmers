package LEVEL1;

import com.sun.org.apache.xpath.internal.operations.String;

public class Solution220823_2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        //1.
        int cnt = 0;
        int zeroCnt = 0;

        for(int lotto: lottos){
            //2.
            if(lotto == 0) {
                zeroCnt ++;
                continue;
            }
            for(int win_num:win_nums){
                //3.
                if(win_num == lotto){
                    cnt ++;
                    break;
                }
            }
        }
        //4. 1->6, 2 ->5, 3 -> 4, 4 ->3, 5->2, 6->1
        // 7 - 2 + 2 =
        System.out.println();
        return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
    }

    public static void main(String[] args) {
        Solution220823_2 sl = new Solution220823_2();
        int[] arr = {44,1,0,0,31,25};
        int[] arr2 = {31,10,45,1,6,19};
        sl.solution(arr,arr2);
        arr2 = new int[]{};
        System.out.println(arr2);

    }
}

