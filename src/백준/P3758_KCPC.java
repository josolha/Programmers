package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P3758_KCPC {
    public static void main(String[] args) throws IOException {


        //k문제 , 팀id, 문제 번호, 점수
        // 최고가 최종점수 , 제출 안하면 0

        //팀아이디,문제번호,점수


        //2는 테스트수

        //3,4,3,5
        //3 => 팀의 개수
        //4 => 문제 개수
        //3 => 팀의 아이디
        //5 => 로그 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());


        for (int i = 0; i <cnt ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int teamCnt = Integer.parseInt(st.nextToken());
            int problemCnt = Integer.parseInt(st.nextToken());
            int teamId = Integer.parseInt(st.nextToken());
            int logsCnt = Integer.parseInt(st.nextToken());

            Team[] teams = new Team[teamCnt];
            for (int j = 0; j < teamCnt ; j++) {
                teams[j] = new Team(j);
            }
            for (int j = 0; j <logsCnt ; j++) {
                st = new StringTokenizer(br.readLine());
                teams[Integer.parseInt(st.nextToken())-1].addProblemAndScore(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),j);
            }
            //System.out.println(Arrays.toString(teams));
            Arrays.sort(teams, new Comparator<Team>() {
                @Override
                public int compare(Team o1, Team o2) {
                    if (o1.totalScore != o2.totalScore) {
                        return Integer.compare(o2.totalScore, o1.totalScore);  // 점수 높은 팀 우선
                    } else if (o1.totalSolvedCnt != o2.totalSolvedCnt) {
                        return Integer.compare(o1.totalSolvedCnt, o2.totalSolvedCnt);  // 제출 횟수 적은 팀 우선
                    } else {
                        return Integer.compare(o1.lastSubmitTime, o2.lastSubmitTime);  // 제출 시간 빠른 팀 우선
                    }
                }
            });
            for (int j = 0; j <teams.length ; j++) {
                if(teams[j].teamId==teamId-1){
                    System.out.println(j+1);
                }
            }
        }
    }
}

class Team{
    HashMap<Integer,Integer> map = new HashMap<>();
    int teamId;

    int totalSolvedCnt = 0;
    int totalScore = 0;
    int lastSubmitTime = 0;  // 마지막 제출 시간 추가

    public Team(int teamId) {
        this.teamId = teamId;
    }
    public void addProblemAndScore(int problem, int score, int time) {
        int currentScore = map.getOrDefault(problem, 0);
        if (score > currentScore) {
            map.put(problem, score);
            totalScore += score - currentScore;
        }
        lastSubmitTime = time;  // 마지막 제출 시간 업데이트
        totalSolvedCnt++;
    }

    @Override
    public String toString() {
        return "Team{" +
                "map=" + map +
                ", teamId=" + teamId +
                ", totalSolvedCnt=" + totalSolvedCnt +
                ", totalScore=" + totalScore +
                '}';
    }
}
