package 백준.복습2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M {

    public static void main(String[] args) throws IOException {

        System.out.println(factorial(5));
        System.out.println(factorial2(1,5));
        System.out.println(factorial3(5));
    }

    private static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
    private static int factorial2(int mutiple,int n){
        if(n<= 1){
            return mutiple;
        }
        return factorial2(mutiple * n, n-1);
    }

    private static int factorial3(int n){
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
