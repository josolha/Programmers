package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import 백준.BufferReader;

public class 슈퍼바이러스 {

    static Long k;
    static Long p;
    static Long n;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //바이러스 수
        k = Long.valueOf(stringTokenizer.nextToken());
        //증가율
        p = Long.valueOf(stringTokenizer.nextToken());
        //총시간
        n = Long.valueOf(stringTokenizer.nextToken()) *10;
       // System.out.println("k(바이러스):"+k+"\np(증가율):"+p+"\nn(총시간):"+n+"");
        //1초 -> P배씩
        recursive(n);
        System.out.println(k%1000000007);
        //System.out.println(k);
    }

    private static void recursive(Long n) {
        if(n==0){
            return;
        }
        k = ((k % 1000000007) * p) % 1000000007;  // 중간 결과에 모듈로 연산 적용
        recursive(n-1);
    }
}
