package 백준.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 원하는정수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();

        for (int i = 0; i < M ; i++) {
            boolean find  =false;
            int target = sc.nextInt();

            int start = 0;
            int end = A.length-1;

            while (start <= end){
                int mid = (start+end)/2;
                int mid_value = A[mid];
                if(mid_value > target){
                    end = mid -1;
                }else if (mid_value < target){
                    start = mid +1;
                }else{
                    find = true;
                    break;
                }
            }
            System.out.println(find);
        }
        System.out.println(Arrays.toString(A));
    }
}
