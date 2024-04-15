package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P1260_DFS와BFS {
    
    static List<Integer>[] lists;

    static boolean[] visited;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int startIndex = Integer.parseInt(st.nextToken());

        visited = new boolean[node+1];
        lists = new ArrayList[node+1];

        for (int i = 0; i <lists.length ; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lists[start].add(end);
            lists[end].add(start);
        }

        System.out.println(Arrays.toString(lists));
        DFS(startIndex);

    }
    static public void DFS(int startNum){
        if(visited[startNum]){
            return;
        }
        visited[startNum] =true;
        System.out.println(startNum);
        for (int nums :lists[startNum]) {
            if(!visited[nums]) {
                DFS(nums);
            }
        }
    }
}
