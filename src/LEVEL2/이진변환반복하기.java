package LEVEL2;

import java.util.Arrays;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int cntZero = 0;
        int restLength = 0;
        int totalZero = 0;
        int totalCnt = 0;
        char[] charArr = s.toCharArray();

        while (charArr.length > 1) {

            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '0') {
                    cntZero++;
                }
            }
            restLength = charArr.length - cntZero;
            totalZero +=cntZero;
            cntZero = 0;
            totalCnt ++;

            charArr = Integer.toBinaryString(restLength).toCharArray();
            System.out.println(Arrays.toString(charArr));
            System.out.println(totalZero);
        }
        int[] answer = {totalCnt,totalZero};
        System.out.println(Arrays.toString(answer));
        return answer;
    }


    public static void main(String[] args) {

        이진변환반복하기 이진 = new 이진변환반복하기();
        String a = "110010101001";
        String b = "01110";
        String c = "1111111";

        이진.solution(c);

    }
}
