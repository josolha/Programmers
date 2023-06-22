package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class P2750_수정렬하기1 {
    /*
        버블 정렬  시간복잡도=> n의 2 제곱
        다른 알고리즘 정렬보다 느린 속도이다.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();

        int[] arr = new int[total];

        for (int i = 0; i <total ; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length -1-i; j++) {

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
