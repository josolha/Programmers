package 백준.복습;

import java.util.Scanner;
import 백준.P2023_신기한소수;

public class 신기한소수 {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        getResult(0,number);

        System.out.println(sb.toString());

    }
    // 재귀함수에 뭔가 계속 넘어가는 값이 들어가고, 끝내기 위한 값이 들어가야하네
    private static void getResult(int i, int number) {
        if(number == 0){
            sb.append(i).append("\n");
            return;
        }
        for (int j = 0; j < 10 ; j++) {
            int next = i * 10 + j;
            if(isPrime(next)){
                getResult(next,number-1);
            }
        }

    }


    private static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
           if(num % i == 0){
               return false;
           }
        }
        return true;
    }
}
