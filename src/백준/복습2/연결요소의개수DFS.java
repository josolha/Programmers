package 백준.복습2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연결요소의개수DFS {

    static ArrayList<Integer>[] lists;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        lists = new ArrayList[n+1];
        visited =  new boolean[n+1];

        for (int i = 1; i < n+1 ; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i <m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            lists[s].add(e);
            lists[e].add(s);
        }
        int count = 0;

        for (int i = 1; i <n+1 ; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : lists[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

}
