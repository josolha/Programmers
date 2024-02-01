package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.sound.midi.Soundbank;

public class N과M_1 {

    static int N;
    static int M;

    static int[] arr;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정적변수 N과 M을 초기화해준다.
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        arr = new int[M]; // 첫번째 도약

        dfs(0);
    }

    private static void dfs(int depth) {
        if(depth == M){
            //System.out.println(Arrays.toString(arr));
            for (int i = 0; i <M; i++) {  // 두번째 도약
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <=N; i++) {
            if(!visited[i]) {   // 세번째 도약
                visited[i] =true;
                arr[depth] = i;
                dfs(depth + 1);
                visited[i] =false;
            }
        }
    }

}
