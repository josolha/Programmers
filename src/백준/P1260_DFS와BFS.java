package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260_DFS와BFS {

    static List<Integer>[] lists;
    static boolean[] dfs_visited;
    static boolean[] bfs_visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int startIndex = Integer.parseInt(stringTokenizer.nextToken());

        dfs_visited = new boolean[n+1];
        bfs_visited = new boolean[n+1];

        lists = new ArrayList[n+1];
        for (int i = 1; i < n+1; i++) {
            lists[i] = new ArrayList<>();
        }


        for (int i = 0; i < m ; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            lists[s].add(e);
            lists[e].add(s);
        }

        //정렬하기
        for (int i = 1; i <n+1 ; i++) {
            if(lists[i] != null){
                Collections.sort(lists[i]);
            }
        }


        //단일 명령의 경우: 람다 표현식이 단일 명령만을 포함하고 있으면,
        //중괄호 없이 System.out.println();을 사용할 수 있습니다. 예를 들어:
        //list.forEach(item -> System.out.println(item));

        //복수 명령의 경우: 만약 람다 표현식이 복수의 명령을 포함하고 있다면,
        // 중괄호 {}를 사용하여 명령들을 감싸야 합니다. 예를 들어:
        //list.forEach(item -> {
        //    System.out.print(item);
        //    System.out.println();
        //});
        
//        Arrays.stream(lists)
//                .filter(lists -> lists != null)
//                .forEach(list -> {
//                    System.out.println(list);
//                    System.out.println();
//                });
//
//        Arrays.stream(lists)
//                .filter(list-> list != null)
//                .forEach(list -> System.out.println("list = " + list));
//
//        Arrays.stream(lists)
//                .filter(list-> list != null)
//                .forEach(list-> {
//                    list.forEach(item -> System.out.print(item));
//                    System.out.println();
//                });
        
        if(!dfs_visited[startIndex]){
            DFS(startIndex);
        }
        System.out.println();
        BFS(startIndex);

    }
    private static void DFS(int v){
        if(dfs_visited[v]){
            return;
        }
        dfs_visited[v] = true;
        System.out.print(v+" ");
        for (int i:lists[v]) {
            if(!dfs_visited[i]){
                DFS(i);
            }
        }
    }
    private static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        bfs_visited[v] =true;

        while (!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now+" ");

            for (int i : lists[now]) {
                if(!bfs_visited[i]) {
                    bfs_visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}
