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

        // 접두사 합과 접미사 합을 위한 Kadane 알고리즘 활용
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        calculateMaxSubarraySum(preferences, prefixMax, suffixMax);

        // 최대 만족도 계산
        int maxSatisfaction = Integer.MIN_VALUE;
        for (int i = 1; i < n - 1; i++) {
            maxSatisfaction = Math.max(maxSatisfaction, prefixMax[i] + suffixMax[i + 1]);
        }

        System.out.println(maxSatisfaction);
    }

    private static void calculateMaxSubarraySum(int[] preferences, int[] prefixMax, int[] suffixMax) {
        int currentMax = preferences[0];
        prefixMax[0] = preferences[0];
        for (int i = 1; i < preferences.length; i++) {
            currentMax = Math.max(preferences[i], currentMax + preferences[i]);
            prefixMax[i] = Math.max(prefixMax[i - 1], currentMax);
        }

        currentMax = preferences[preferences.length - 1];
        suffixMax[preferences.length - 1] = preferences[preferences.length - 1];
        for (int i = preferences.length - 2; i >= 0; i--) {
            currentMax = Math.max(preferences[i], currentMax + preferences[i]);
            suffixMax[i] = Math.max(suffixMax[i + 1], currentMax);
        }
    }
}
