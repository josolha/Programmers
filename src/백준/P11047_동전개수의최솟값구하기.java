package 백준;

import java.util.Scanner;

public class P11047_동전개수의최솟값구하기 {

    /*
      그리디 알고리즘.

      항상 현재 상태에서 최선을 선택한다.

      여기서 최선의 수는 최대한 큰 금액의 동전으로 구성함.

      주의사항:
        그리디 알고리즘은 잘 따져보지 않으면 반례가 생김
        (배수의 형태) 이거의 조건이 너무 중요함
        이 뜻은 반례 없이 문제가 해결 될수 있다.
        그래서 큰 동전부터 차례대로 사용될수 있다.
        왜 조건이 중요했는지 직접 코드를 통해 느껴봐야함.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i <N; i++) {
            A[i] = sc.nextInt();
        }
        //그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0;
        for (int i = N-1; i >0 ; i--) {
            if(A[i] <= K){
                count += (K/A[i]);
                K = K % A[i];
            }
        }
        System.out.println("count = " + count);
    }
}
