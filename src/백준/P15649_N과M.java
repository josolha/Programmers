package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P15649_N과M {

    static boolean[] visited;

    static int[] arr;
    static int M;
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        arr = new int[M];
        visited = new boolean[N+1];

        //1.단순 반복문으로 통한 출력 (시간 복잡도 N^M)
        /*

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <= N ; j++) {
                if(i!=j){
                    System.out.println(i+" "+j);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        */
        dfs(0);
        System.out.println(sb);


        //========================
        // N! 계산
        int a = 1;
        for (int i = 1; i <= N; i++) {
            a *= i;
        }
        // (N-M)! 계산
        int b = 1;
        for (int i = 1; i <= N - M; i++) {
            b *= i;
        }
        // 순열 NPM 계산
        int permutation = a / b;
        System.out.println("4P2: " + permutation);
        //========================

        int permutationUsingRecursive = factorial(N) / factorial(N-M);
        System.out.printf("%d"+"P"+"%d :"+permutationUsingRecursive,N,M);

        System.out.println(factorial2(1,3));

    }
    private static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }

    private static int factorial2(int mutiple,int n){
        if(n<= 1){
            return mutiple;
        }
        return factorial2(mutiple * n, n-1);
    }

    private static void dfs(int depth) {
        //1.탈출문
        if(depth == M){
            //System.out.println(Arrays.toString(arr));
            for (int i = 0; i < M ; i++) {
                sb.append(arr[i]+" ");
                //System.out.print(arr[i]+" ");
            }
            sb.append("\n");
            //System.out.println();
            return;
        }
        //2.본문
        for (int i = 1; i <= N; i++) {
            if(!visited[i]) {
                visited[i] =true;
                arr[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }

        }
    }
}
