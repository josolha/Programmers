package 백준.복습;

import java.util.Scanner;

public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count =1;
        int sum = 1;
        int start_index = 1;
        int end_index =1;

        while(end_index != number){
            if(sum == number){
                count++;
                end_index++;
                sum += end_index;
            }
            else if(sum <number){
                end_index++;
                sum += end_index;
            }else{
                sum -= start_index;
                start_index++;
            }
        }
        System.out.println(count);



    }
}
