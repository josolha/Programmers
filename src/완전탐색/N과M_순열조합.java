package 완전탐색;

import java.util.Arrays;

public class N과M_순열조합 {
    private static int n, m;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리

    public static void main(String[] args) {
        n = 4;
        m = 2;
        arr = new int[m];
        visited = new boolean[n + 1];
        System.out.println("순열");
        permutation(0);
        System.out.println("조합");
        repeatedCombination(0,1);
    }
    // 순열
    private static void permutation(int cnt) {
        if (cnt == m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = i;
                permutation(cnt + 1);
                visited[i] = false;
            }
        }
    }

    // 중복 순열 - 중복 제거하는 visited를 쓰지 않음
    private static void repeatedPermutation(int cnt) {
        if (cnt == m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[cnt] = i;
            permutation(cnt + 1);
        }
    }
    // 조합
    private static void combination(int cnt, int start) {
        if (cnt == m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[cnt] = i;
            combination(cnt + 1, i + 1); // 오름차순으로 구하면 중복 체크하지 않아도 됨
        }
    }

    // 중복 조합
    private static void repeatedCombination(int cnt, int start) {
        if (cnt == m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[cnt] = i;
            combination(cnt + 1, i); // 중복 허용하니까 비내림차순
        }
    }
}
