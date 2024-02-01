package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M {
    public static int N;	// 정적변수로 변경
    public static int M;	// 정적변수로 변경
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정적변수 N과 M을 초기화해준다.
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N+1];

//        for (int i = 1; i <=N ; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                if (i != j) {
//                    System.out.println(i + " " + j);
//                }
//            }
//        }
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                for (int k = 1; k <= N; k++) {
//                    if (i != j && i != k && j != k) {
//                        System.out.println(i + " " + j + " " + k);
//                    }
//                }
//            }
//        }

        recursive(0);
        System.out.println(sb);
    }

    static void recursive(int depth) {
        if (depth == M) {
//            for (int i = 0; i < M; i++) {
//                System.out.print(arr[i] + " ");
//            }
           // System.out.println(Arrays.toString(arr));
            for (int i = 0; i < M ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                recursive(depth + 1);
                visit[i] = false;
            }
        }
    }
}
