package DFSBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class 여행경로복습 {
    public static void main(String[] args) {
            String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
            여행경로복습_Solution sl = new 여행경로복습_Solution();
            System.out.println(Arrays.toString(sl.solution(tickets)));
    }
}
class 여행경로복습_Solution {

    boolean[] visited;
    String[] answer;
    String[][] tickets;

    List<String> list = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        visited = new boolean[tickets.length];

        dfs(0,"ICN","ICN");

        Collections.sort(list);

        answer = list.get(0).split(" ");
        System.out.println("list = " + list);
        return answer;
    }

    private void dfs(int cnt, String init, String tripWords) {
        if(cnt == tickets.length){
            list.add(tripWords);
        }
        for (int i = 0; i < visited.length ; i++) {
            if(!visited[i] && init.equals(tickets[i][0])){
                visited[i] = true;
                dfs(cnt+1,tickets[i][1],tripWords+" "+tickets[i][1]);
                visited[i] = false;
            }
        }
    }
}