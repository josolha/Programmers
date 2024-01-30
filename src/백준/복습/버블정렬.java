package 백준.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 버블정렬 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();

        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = scanner.nextInt();
        }



        for (int i = 0; i < arr.length-1 ; i++) {

            for (int j = 0; j < arr.length-1 -i ; j++) {

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
