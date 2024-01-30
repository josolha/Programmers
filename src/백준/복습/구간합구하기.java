package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        
        int cntNumber = Integer.parseInt(stringTokenizer.nextToken());
        int cntTry = Integer.parseInt(stringTokenizer.nextToken());
        
        int[] numbers = new int[cntNumber+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //1. 합 배열
        for (int i = 1; i <= cntNumber ; i++) {
            numbers[i] = numbers[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
//        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        for (int i = 0; i <cntTry ; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());

            //2. 구간 합구하기
            System.out.println(numbers[end]-numbers[start-1]);

        }








    }
}
