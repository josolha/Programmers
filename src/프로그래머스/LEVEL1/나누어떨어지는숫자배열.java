package 프로그래머스.LEVEL1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> Al = new ArrayList<Integer>();
        int cnt = 0;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%divisor==0){
                Al.add(arr[i]);
                cnt++;

            }

        }
        if(cnt ==0){
            int[] answer = {-1};
            System.out.println(Arrays.toString(answer));
            return answer;
        }

        int [] answer = new int[Al.size()];
        for (int i = 0; i < answer.length ; i++) {
            answer[i] = Al.get(i);
        }


        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 sl = new 나누어떨어지는숫자배열();
        int[] arr = {6,9,7,6};
        int a = 5;

        sl.solution(arr,a);

    }
}
