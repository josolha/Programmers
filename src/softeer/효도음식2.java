package softeer;

import java.util.Arrays;
import java.util.Scanner;

public class 효도음식2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        int[] preMaxArr = new int[input];
        preMaxArr[0] = arr[0];

        int currentMax = arr[0];
        for (int i = 1; i < input; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            preMaxArr[i] = Math.max(preMaxArr[i - 1], currentMax);
        }


        int[] suffMaxArr = new int[input];
        suffMaxArr[input -1] = arr[input-1];
        currentMax = arr[input - 1];
        for (int i = input - 2; i >= 0; i--) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            suffMaxArr[i] = Math.max(suffMaxArr[i + 1], currentMax);
        }


        int maxResult = Integer.MIN_VALUE;
        for (int i = 1; i < input-1 ; i++) {
            maxResult = Math.max(maxResult, preMaxArr[i-1]+suffMaxArr[i+1]);
        }

//        System.out.println("preMaxArr = " + Arrays.toString(preMaxArr));
//        System.out.println("suffMaxArr = " + Arrays.toString(suffMaxArr));
        System.out.println("maxResult = " + maxResult);
    }
}
