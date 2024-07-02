package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

public class KCPC {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        Map<Integer, Team> treeMap = new TreeMap<>();

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int teamCnt = Integer.parseInt(st.nextToken());
            int problemCnt = Integer.parseInt(st.nextToken());
            int teamIdCnt = Integer.parseInt(st.nextToken());
            int logsCnt = Integer.parseInt(st.nextToken());
            //treeMap.put(i+1,new Team());

            for (int j = 0; j <logsCnt ; j++) {
                st = new StringTokenizer(br.readLine());
                int teamId = Integer.parseInt(st.nextToken());
                int problemNum = Integer.parseInt(st.nextToken());
                int score = Integer.parseInt(st.nextToken());

                treeMap.putIfAbsent(teamId,new Team());
                treeMap.get(teamId).add(problemNum,score,j+1);

            }
            System.out.println(treeMap);
        }
    }
}
class Team implements Comparable<Team>{
    Map<Integer,Integer> pbAndScore = new HashMap<>();
    int totalScore;
    int time;
    int solvedCnt;


    //1.total 30 -> 70->
    //(1-0),  (2-0)   (2,40)
    //(1,30) ,(2,40), (2,30)
    public void add(int problem,int score,int time ) {
        int currentPbSc = pbAndScore.getOrDefault(problem, 0);
        if(score>currentPbSc){
            pbAndScore.put(problem,score);
            totalScore += (score-currentPbSc);
        }
        this.time = time;
        this.solvedCnt++;
    }

    @Override
    public String toString() {
        return "Team{" +
                "pbAndScore=" + pbAndScore +
                ", totalScore=" + totalScore +
                ", time=" + time +
                ", solvedCnt=" + solvedCnt +
                '}';
    }

    @Override
    public int compareTo(@NotNull Team o) {
        if(this.totalScore != o.totalScore){
            return o.totalScore - this.totalScore;
        }else if(this.solvedCnt != o.solvedCnt){
            return this.solvedCnt - o.solvedCnt;
        }else{
            return this.time - o.time;
        }
    }
}