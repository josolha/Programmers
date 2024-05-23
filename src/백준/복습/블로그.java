package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 블로그 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int days = Integer.parseInt(st.nextToken());

        int[] list = new int[total];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total ; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }


        int sum =0;

        int answer = 1;
        for (int i = 0; i < days; i++) {
            sum +=list[i];
        }
        int max =sum;

        for (int i = 0; i < total - days ; i++) {
            sum += list[i+days];
            sum -= list[i];

            if(sum == max){
                answer++;
            }
            if(sum >max){
                max = sum;
                answer =1;
            }

        }
        System.out.println(max);
        System.out.println(answer);
    }
}
