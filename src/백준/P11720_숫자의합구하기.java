package 백준;

import java.util.Scanner;

public class P11720_숫자의합구하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String numbers = sc.next();

        char[] array = numbers.toCharArray();

        int answer = 0;

        for (int i = 0; i < input ; i++) {
            /*
              아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이다
              예를들어 문자 '1' 은 아스키코드 값이 49이므로
              '1' - 48  또는 '1' -'0' 으로 연산하면 된다.
             */

            answer += array[i]-'0';
        }
        System.out.println("answer = " + answer);
    }

}
