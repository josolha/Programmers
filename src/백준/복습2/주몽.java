package 백준.복습2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int size  = Integer.parseInt(bufferedReader.readLine());
        int makeNumber  = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[size];
        
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < size ; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);
        
        int i = 0;
        int cnt = 0;
        int j = size -1;
        
        while(i<j){
            if(arr[i]+arr[j]<makeNumber){
                i++;
            } else if (arr[i]+arr[j]>makeNumber) {
                j--;
            }
            else{
                cnt++;
                i++;
                j--;
            }
        }
        System.out.println("cnt = " + cnt);

        


    }
}
