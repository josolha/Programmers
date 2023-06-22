package 백준;

import java.util.Scanner;

public class P1427_내림차순으로자릿수정렬하기 {

    /*
     선택정렬 n의 2승

     버블 정렬에서는 '지금 이 요소가 다음 요소보다 큰가?'라는 질문만 필요하다면,
     선택 정렬에서는 '지금 이 요소가 지금까지 본 요소 중 가장 큰가?'라는 질문이 필요하다.

     따라서 max라는 인덱스 저장 변수가 필요함
     */

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        String str = sc.next();

        int[] A = new int[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        //선택정렬
        for (int i = 0; i < str.length(); i++) {
            int max = i; //가장 큰 숫자 인덱스 저장 변수
            for (int j = i+1; j <str.length() ; j++) {
                if(A[j]>A[max]){
                    max = j;
                }
            }
            if(A[i] < A[max]){
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }


    }
}
