package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class P1259_팰린드롬수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] chars = num.toCharArray();

        System.out.println(Arrays.toString(chars));

        boolean answer = true;

        for (int i = 0; i < chars.length/2 ; i++) {
            if(chars[i] != chars[chars.length-1-i]){
                answer =false;
                break;
            }
        }
        System.out.println(answer ? "yes" : "no");
    }
}
