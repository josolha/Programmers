package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P21921_블로그 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int total = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] visit = new int[total];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            visit[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i = 0; i <day; i++) {
            sum += visit[i];
        }
        int max = sum;
        int answer = 1;

        for (int i = 0; i < total - day; i++) {
            sum += visit[i+day];
            sum -= visit[i];

            if(sum == max){
                answer++;
            }
            if(sum>max){
                answer =1;
                max = sum;
            }
        }

        if(max ==0){
            System.out.println("SAD");
        }else{
            System.out.println(max);
            System.out.println(answer);
        }


    }
}
