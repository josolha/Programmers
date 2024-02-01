package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 징검다리 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int length = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[length];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(Arrays.toString(arr));

        int cnt = 1;
        int temp = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > temp){
                cnt++;
                temp = arr[i];
            }
        }
        System.out.println(cnt);
    }

    // 1. 수의 합을 반복적으로 구합니다
    // 2. 이 때 합이 음수이면 그 다음 수부터 다시 시작 합니다.
    // 3. 합의 최댓값을 도출합니다.
}
