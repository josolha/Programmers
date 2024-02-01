package softeer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 구간합 {
    public static void main(String[] args) {

        int[] arr = new int[]{15,13,10,7,3,12};
        System.out.println("주어진 배열 :" + Arrays.toString(arr));

        int[] s = new int[arr.length];
        s[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            s[i] = s[i-1] + arr[i];
        }
        System.out.println("합 배열 :" + Arrays.toString(s));

        int start = 2;
        int end = 5;
        System.out.println("구간 합 :" + (s[end] - s[start-1]));

    }

    //
}
