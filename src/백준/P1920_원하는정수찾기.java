package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class P1920_원하는정수찾기 {



    /*
        제한 시간 2초 , 해당 자연수 10,000
        n 제곱으로 풀면 안된다.(단순 반복문)
        따라서 이진 탐색을 이용

        근데 정렬이 되어있어야하는데
        그럼 정렬하는데 시간이 너무 오래 걸리는거아니야?

        자바 sort를 하면 nlogn의 복잡도가 걸림
        이진 탐색도 nlogn의 복잡도가 걸림

        그래서 총 nlogn + nlogn = 2nlogn 하지만 복잡도에서 상수는 제외시킴

        따라서 nlogn 을 써도 시간을 초과하지 않는다.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N ; i++) {
            A[i] =sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        for (int i = 0; i <M; i++) {
            boolean find = false;
            int target = sc.nextInt();
            int start = 0;
            int end = A.length -1;
            while(start <= end){
                int mid_index = (start+end) /2 ;
                int mid_value = A[mid_index];
                if(mid_value > target){
                    end = mid_index -1;
                }else if(mid_value < target){
                    start = mid_index +1;
                }else{
                    find = true;
                    break;
                }
            }
            if(find){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }




    }
}
