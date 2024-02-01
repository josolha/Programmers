package 백준.복습;

import java.util.Scanner;

public class 평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // (score[count]/최대값*100)/count

        long max = 0;
        long sum = 0;
        double answer = 0;

        for (int i = 0; i < count; i++) {
            int temp = sc.nextInt();
            if(temp > max){
                max = temp;
            }
            sum += temp;
        }
//        System.out.println("sum = " + sum);
//        System.out.println("max = " + max);
        
        answer = (double)sum/max*100/count;
        System.out.println("answer = " + answer);
    }
}
