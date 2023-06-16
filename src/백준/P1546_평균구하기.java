package 백준;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        int[] score = new int[subjects];


        for (int i = 0; i < subjects ; i++) {
            score[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < subjects ; i++) {
            if(score[i]>max){
                max = score[i];
            }
            sum = sum+score[i];
        }

//        (double)sum/max*100/count;
        // 소수점도 필요하기 때문에 변수 조심해야함.
        System.out.println(sum*100.0/max/subjects);
    }
}
