package 백준.복습2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타노스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        char[] arr = a.toCharArray();

        int cnt0 = 0;
        int cnt1 = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] =='1'){
                cnt1 ++;
            }else{
                cnt0++;
            }

        }

        cnt0 /=2;
        cnt1 /=2;

        for (int i = 0; i <a.length() && cnt1 !=0; i++) {
            if(arr[i] == '1'){
                cnt1--;
                arr[i] = '2';
            }
        }

        for (int i = a.length()-1; i >= 0 && cnt0 !=0 ; i--) {
            if(arr[i]=='0'){
                cnt0--;
                arr[i] = '2';
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!='2'){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
