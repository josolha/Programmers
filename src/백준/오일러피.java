package 백준;


import java.util.Scanner;

public class 오일러피 {
    public static void main(String[] args) {

        /*
         p[6] = 1~6 범위에서 6과 서로소인 자연수 개수

         서로수 : 공약수가 1이외가 없다.

         ex) 1 2 3 4 5 6
         6과 서로인 수인 개수는 2개 (1,5)

         에라토스테네스의 체와 비슷함

         1.구하고자 하는 오일러의 피의 범위 만큼 배열을 자기 자신의 인덱스값으로 초기화

         2.2부터 시작해 현제 배열의 값과 인덱스가 같으면(=소수일때) 현재 선택된 숫자(k)의 배수에 해당하는
         수를 배열에 끝까지 탐색하며 P[i] = P[i] - P[i]/k 연산 수행

         3.배열의 끝까지 2를 반복한다.
         */
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int[] phi = new int[N + 1];

            for (int i = 0; i <= N; i++) {
                phi[i] = i;
            }
            //0,1,2,3,4,5,6
            //p = 3, phi[3]
            //p = 2,

            for (int p = 2; p <= N; p++) {
                if (phi[p] == p) { // p가 소수인 경우
                    phi[p] = p - 1;
                    for (int i = 2 * p; i <= N; i += p) {
                        phi[i] = (phi[i] / p) * (p - 1);
                    }
                }
            }

            // 출력
          System.out.println("phi[N] = " + phi[N]);
        }
}
