package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽의명령 {
        /*

       투 포인터 활용

       예) (2 7 4 1 5 3)

       1.정렬
           sort -> nlogn 복잡도

           (1,2,3,4,5,7)

       2.조건문 (처음인덱스가 끝인덱스 보다 작을때까지){
            if(처음인덱스의 값 + 끝인덱스 < 만드는수)
            {
              처음인덱스++;
              (제일 작은수를 더해야하니깐)
            }else if(처음인덱스의 값 + 끝인덱스 == 만드는수){
               answer++;
               처음인덱스++;
               끝인덱스++;
                (값이 사라져야하니깐)
            }else if(처음인덱스의 값 + 끝인덱스의 값 > 만드는수{
               마지막인덱스++;
              (제일큰수를 뺴야해서)
            }

       }

     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(bufferedReader.readLine());
        int M  = Integer.parseInt(bufferedReader.readLine());
        
        int[] A = new int[N];
        
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N ; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        
        Arrays.sort(A);
        
        int count = 0;
        int i = 0;  //A[0] = min
        int j = N-1; // A[N-1] = max
        while(i<j){
            if(A[i]+A[j]<M)i++;
            else if (A[i]+A[j]>M)j--;
            else{
                count++;
                i++; j--;
            }
        }
        System.out.println("count = " + count);
        
    }
}
