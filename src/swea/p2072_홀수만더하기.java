package swea;

import java.util.Scanner;

public class p2072_홀수만더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i = 0; i <cnt ; i++) {
            int total =0;
            for (int j = 0; j < 10 ; j++) {
                int number = sc.nextInt();
                if(number %2 !=0){
                    total+= number;
                }

            }
            System.out.println("total = " + total);
        }
    }

}
