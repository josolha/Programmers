package 백준.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int[] arr = new int[number.length()];

        for (int i = 0; i <number.length() ; i++) {
            arr[i] = Integer.parseInt(number.substring(i,i+1));
        }

        for (int i = 0; i < arr.length ; i++) {

            // 최대값을 구하기 위해 인덱스를 저장 시킴
            int min = i;

            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] < arr[i]){
                    min = j;
                }
            }

            if(arr[i] > arr[min]){
                int temp = arr[i];
                arr[i]  = arr[min];
                arr[min] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
