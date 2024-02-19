package softeer;

import java.util.Arrays;
import java.util.Scanner;

public class 효도음식 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] preferences = new int[n];
        for (int i = 0; i < n; i++) {
            preferences[i] = scanner.nextInt();
        }

        // 접두사 최대 합 계산
        int[] prefixMax = new int[n];
        int currentMax = preferences[0];
        prefixMax[0] = currentMax;
        System.out.println("prefixMax = " + Arrays.toString(prefixMax));
        System.out.println("currentMax = " + currentMax);

        for (int i = 1; i < n; i++) {
            currentMax = Math.max(preferences[i], currentMax + preferences[i]);
            prefixMax[i] = Math.max(prefixMax[i - 1], currentMax);
        }

        // 접미사 최대 합 계산
        int[] suffixMax = new int[n];
        currentMax = preferences[n - 1];
        System.out.println("currentMax = " + currentMax);
        suffixMax[n - 1] = currentMax;

        for (int i = n - 2; i >= 0; i--) {
            currentMax = Math.max(preferences[i], currentMax + preferences[i]);
            suffixMax[i] = Math.max(suffixMax[i + 1], currentMax);
        }

        // 두 요리에 대한 최대 만족도 계산
        int maxSatisfaction = Integer.MIN_VALUE;
        for (int i = 1; i < n - 1; i++) {
            maxSatisfaction = Math.max(maxSatisfaction, prefixMax[i-1] + suffixMax[i + 1]);
        }

        System.out.println(maxSatisfaction);
    }
}
