package LEVEL1;

import java.util.Arrays;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {


        int answer = 0;

        int[] number_all = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < number_all.length; j++) {
                if(number_all[j] == numbers[i]){
                    number_all[j] = 0;
                }
            }
        }
        for (int i = 0; i < number_all.length ; i++) {
            answer += number_all[i];
        }


        return answer;


    }


    public static void main(String[] args) {
        없는숫자더하기 sl = new 없는숫자더하기();

        int[] number = {1,2,3,4,6,7,8,0};

        sl.solution(number);

    }

}
