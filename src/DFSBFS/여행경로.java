package DFSBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

public class 여행경로 {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        여행경로_Solution sl = new 여행경로_Solution();
        System.out.println(Arrays.toString(sl.solution(tickets)));
    }
}

class 여행경로_Solution {
    
    boolean[] visited;
    String[][] tickets;
    String[] answer;

    ArrayList<String> list =new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        this.tickets = tickets;

        DFS(0,"ICN","ICN");
        Collections.sort(list);
        answer = list.get(0).split(" ");

        System.out.println("list = " + list);
        return answer;
    }

    private void DFS(int cnt, String start, String words) {
        if(cnt == tickets.length){
            list.add(words);
            return;
        }
        for (int i = 0; i < visited.length ; i++) {
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] =true;
                DFS(cnt+1,tickets[i][1],words+" "+tickets[i][1]);
                visited[i] =false;
            }
        }
    }
}

