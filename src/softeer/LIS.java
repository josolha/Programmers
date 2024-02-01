package softeer;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,4,5};
        int[] dp = new int[arr.length];

        int maxLIS= 0;

        for (int i = 0; i < arr.length ; i++) {
            dp[i] = 1;
            for (int j = 0; j <i ; j++) {
                if(arr[i] > arr[j]){
                   dp[i] = Math.max(dp[i],dp[j] +1);
                }
            }
            maxLIS = Math.max(maxLIS,dp[i]);
        }


        System.out.println("arr :" + Arrays.toString(arr));
        System.out.println("dp :" + Arrays.toString(dp));
        System.out.println(maxLIS);
    }
}
