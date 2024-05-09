package swea;

import java.util.Arrays;
import java.util.Scanner;

public class P1926_간단한369게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String[] numbers = new String[number+1];

        for (int i = 1; i <number+1 ; i++) {
            numbers[i] = Integer.toString(i);
        }

        for (int i = 1; i < numbers.length; i++) {
            StringBuilder sb = new StringBuilder();
            char[] chars = numbers[i].toCharArray();
            for (int j = 0; j < chars.length ; j++) {
                if(chars[j] == '3'||chars[j] == '6'||chars[j] == '9'){
                    sb.append('-');
                }else{
                    sb.append(chars[j]);
                }
            }
            numbers[i] = sb.toString();

        }
        for (int i = 1; i <numbers.length; i++) {
            if(i==numbers.length-1){
                System.out.print(numbers[i]);
            }else{
                System.out.print(numbers[i]+" ");
            }
        }
    }
}
