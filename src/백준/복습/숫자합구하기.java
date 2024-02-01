package 백준.복습;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class 숫자합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] chars =sc.next().toCharArray();

        int answer = 0;

        for (int i = 0; i <size; i++) {
            answer += chars[i] - '0';
        }

        System.out.println("answer = " + answer);
    }
}
