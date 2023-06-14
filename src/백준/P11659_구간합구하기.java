package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {

    /*
      ===================================
       합 배열

         예) 배열 A -> 15 13 10 7 3 12
          합 배열 S -> 15 28 38 45 48 60

          **합 배열 S를 만드는 공식
          S[i] = S[i-1] + A[i]
       ===================================
        구간 합

          예)
             A[2] 부터 A[5]까지 구간 합구하기

                배열 A -> 15 13 10 7 3 12
                   S[5]<--------------->
                   S[1]<-----><-------->
                              구하고싶은 영역

           ** i에서 j까지 구간합 공식
             S[j] - S[i-1]
        ==================================
     */

    public static void main(String[] args) throws IOException {

        /*

        받는 개수가 많을때는 BufferedReader를 활용한다 Scanner 보다 더 빠르다.
        BufferedReader를 사용할때와 Scanner의 속도가 차이가 나는 이유는 buffer 사용 여부의 차이임
        Scanner는 1KB 크기의 버퍼를 갖기 때문에 입력이 바로 전달되는 반면 BufferedReader는
        8KB 크기의 버퍼를 가져 buffer에 입력들을 저장하였다 한 번에 전송하기 때문에 속도가 더 빠르다.

        Scanner = 다양한 유형의 입력 처리 유용
        BufferedReader = 대량의 문자열 데이터 처리에 유용
        StringTokenizer = 문자열을 특정 구분자를 기준으로 나누는데 사용,
                          나눠진 각각의 문자열을 토큰(token)이라고 부른다.


        풀이순서
        1.suNo(숫자 개수), quizNo(질의 개수) 저장하기
        2.for(숫자 개수만큼 반복하기){
            합배열 생성하기
        }
        3.for(질의 개수만큼 반복하기){
            질의 범위받기
            구간합출력하기
        }

         */


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        //합배열 크기 정하기 (초기값 0이라 +1 해준 크기가 필요)
        long[]S = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //합배열 생성하기
        for (int i = 1; i <= suNo ; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(S[j]-S[i-1]);
        }
    }
}
