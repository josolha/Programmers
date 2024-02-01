package softeer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 징검다리 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int length = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[length];
        int[] dp = new int[arr.length];
        int max = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i <arr.length ; i++) {
            dp[i]= 1;
            for (int j = 0; j <i ; j++) {
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}
