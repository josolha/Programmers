package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의명령 {
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

        int cnt = Integer.parseInt(bufferedReader.readLine());
        int number = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] ingredients = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            ingredients[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(ingredients);

        int answer = 0;
        int start_index = 0;
        int end_index = cnt-1;

        while (start_index<end_index){
            if(ingredients[start_index] + ingredients[end_index]< number){
                start_index++;
            }else if(ingredients[start_index] + ingredients[end_index] ==number){
                answer++;
                start_index++;
                end_index--;

            }else{
                end_index--;
            }
        }
        System.out.println(answer);

    }
}
