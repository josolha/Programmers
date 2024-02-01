package 완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 카펫복습 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;

        카펫_Solution sl = new 카펫_Solution();
        System.out.println(Arrays.toString(sl.solution(brown,yellow)));



    }

}
class 카펫_Solution {
    int[] answer = new int[2];

    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        for (int i = 1; i < sum ; i++) {
            //i는 가로의 길이
            if(sum%i==0){
                int divideNum = sum/i; //세로 길이
                if(((i -2)*(divideNum-2)) == yellow){
                    answer[0] = divideNum;
                    answer[1] = i;
                    return answer;
                }
            }
        }
        return answer;
    }
}
