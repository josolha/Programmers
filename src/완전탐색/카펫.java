package 완전탐색;

import java.util.Arrays;

public class 카펫 {
    public static void main(String[] args) {

        카펫 카펫 = new 카펫();
        카펫.solution(24,24);

    }
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        //1. 타일의 총합 개수 구하기
        int sum = brown + yellow;

        //2. 약수 구하기
        for (int i = 1; i <= sum ; i++) {
            int row = i;
            int col = sum / row;

            //3.세로 > 가로 뺴기
            if(row>col){
                continue;
            }

            //4.노랑 개수 일치하면 멈춤
            if((row -2) * (col-2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
