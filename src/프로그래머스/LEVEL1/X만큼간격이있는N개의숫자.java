package 프로그래머스.LEVEL1;

import java.util.Arrays;

public class X만큼간격이있는N개의숫자 {
    public long[] solution(int x, int n) {


//        if(n==0){
//            long[] answer = {x};
//            return answer;
//        }

        long[] answer = new long[n]; //5개

        for (int i = 0; i < n; i++) { //(1,2,3,4,5)
            answer[i] = x+(i*x); // 0 2 4 6 8 -> 2 4 6 8 10
                    //  (i+1)*x;    1,2,3,4,5  -> 2,3,4,6,10
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        X만큼간격이있는N개의숫자 sl = new X만큼간격이있는N개의숫자();

        int x = 2;
        int n = 5;
        sl.solution(x,n);

    }
}

