package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import javax.swing.JViewport;

public class 연결요소의개수DFS {

    static List<Integer>[] A;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        //1. n(노드 개수) m(엣지 개수) 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        //2. A(그래프 데이터 저장 인접 리스트 배열 초기화)
            //2-1. 배열 크기만큼 n만큼 생성 , 방문배열 생성
        A = new ArrayList[n+1];
        visited = new boolean[n+1];

            //2-2. 그안에 ArrayList 생성
        for (int i = 1; i < n+1 ; i++) {
            A[i] = new ArrayList<>();
        }

        //3. 인접 리스트에 그래프 데이터 저장하기
        for (int i = 0; i <m ; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        //저장된 값 보기 (스트림)
        Arrays.stream(A)
                .filter(list -> list != null)
                .forEach(list -> {
                    list.forEach(item -> System.out.print(item + " "));
                    System.out.println();
                });

        int count = 0;

        for (int i = 1; i < n+1 ; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }

        }
        System.out.println("answer ="+count);
    }

    private static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;

        for (int i: A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
