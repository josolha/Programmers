package 백준.복습2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 구간합구하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int size  = Integer.parseInt(stringTokenizer.nextToken());
        int cnt = Integer.parseInt(stringTokenizer.nextToken());

        int[] sumArr = new int[size+1];
        
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <sumArr.length ; i++) {
            sumArr[i] = sumArr[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < cnt ; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int j = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println("answer : " + (sumArr[k]-sumArr[j-1]));
        }
    }
}
