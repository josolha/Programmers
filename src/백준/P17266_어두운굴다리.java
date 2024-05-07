package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class P17266_어두운굴다리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roadLength = sc.nextInt();
        int lightCnt = sc.nextInt();
        int[] lightIndex = new int[lightCnt];

        for (int i = 0; i < lightCnt ; i++) {
            lightIndex[i] = sc.nextInt();
        }

        int left = lightIndex[0];
        int right = roadLength-lightIndex[lightCnt-1];
        int maxMiddle = 0;


        for (int i = 0; i <lightIndex.length-1 ; i++) {
            maxMiddle = Math.max(maxMiddle,lightIndex[i+1] - lightIndex[i]);
        }

        
        int result =  Math.max((int)Math.ceil((double)maxMiddle/2),Math.max(left,right));
        System.out.println("result = " + result);

    }
}
