package 백준.복습2;

import java.util.Scanner;

public class 연속된자연수의합구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while(end != number){
            if(sum < number){
                end++;
                sum += end;
            } else if (sum > number) {
                sum -= start;
                start++;
            } else if(sum == number){
                count++;
                end++;
                sum += end;

            }
        }
        System.out.println("count = " + count);
    }
}
