package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11501_주식 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            int cnt = Integer.parseInt(br.readLine());

            int[] arr = new int[cnt];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            //System.out.println(Arrays.toString(arr));
            long profit = 0;
            int maxValue = arr[cnt-1];

            for (int j = cnt-2; j >=0  ; j--) {
                if(arr[j]>maxValue){
                    maxValue = arr[j];
                }else{
                    profit += (maxValue -arr[j]);
                }
            }
            sb.append(profit+"\n");

        }
        System.out.print(sb.toString());

    }
}
