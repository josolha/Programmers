package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10431_줄세우기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[20];


        int tryCnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < tryCnt ; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            sb.append(order+" ");

            for (int j = 0; j < arr.length ; j++) {
                int arrSeveral = Integer.parseInt(st.nextToken());
                arr[j] = arrSeveral;
            }

            int moveCnt =0;

            //여기서 이제 정렬해야함.
            for (int j = 1; j < arr.length; j++) {
                int target = arr[j];
                int frontIndex = j-1;

                while(frontIndex >= 0 && target < arr[frontIndex]){
                    arr[frontIndex+1] = arr[frontIndex];
                    moveCnt++;
                    frontIndex--;
                }
                arr[frontIndex +1] = target;
            }
            sb.append(moveCnt+"\n");
        }
        System.out.println(sb);
    }
}
