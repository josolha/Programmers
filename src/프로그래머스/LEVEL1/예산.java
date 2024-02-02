package 프로그래머스.LEVEL1;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {

        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length ; i++) {
            if(budget - d[i] >= 0){
                budget -= d[i];
                answer++;
            }else{
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        예산 sl = new 예산();
        int[] d = {2,2,3,3};
        int budget = 10;
        sl.solution(d,budget);
    }

}
