package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P20310_타노스 {

        /*
        사전순으로 가장 빠른 것

        예) 1100
        0은 뒤에서 부터 1은 앞에서 부터 지워야 빠른수가 나옴 -> 이게 핵심이구나..
        지우는 순서는 상관없음

        101011


        */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        char[] arr = a.toCharArray();

        int cnt0 = 0;
        int cnt1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(a.charAt(i) =='0'){
                cnt0++;
            }else{
                cnt1++;
            }
        }
        cnt0/=2;
        cnt1/=2;

        // 1 없애기
        for (int i = 0; i < a.length() && cnt1!=0; i++) {
            if (arr[i] == '1') {
               cnt1--;
               arr[i] = '2';
            }
        }

        // 0 없애기
        for (int i = a.length()-1; i >= 0 && cnt0!=0; i--) {
            if (arr[i] == '0') {
                cnt0--;
                arr[i] = '2';
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (arr[i] != '2')
                answer.append(arr[i]);
        }
        System.out.println(answer);
    }
}

