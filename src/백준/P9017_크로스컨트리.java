package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class P9017_크로스컨트리 {
    static int[] scoreList;

    static Map<Integer,List<Integer>> teamScore;

    public static void main(String[] args) throws IOException {
        //한 팀은 여섯 명의 선수로 구성되며,
        //팀 점수는 상위 네 명의 주자의 점수를 합하여 계산한다.
        //점수는 자격을 갖춘 팀의 주자들에게만 주어지며,
        //결승점을 통과한 순서대로 점수를 받는다.
        //이 점수를 더하여 가장 낮은 점수를 얻는 팀이 우승을 하게 된다.
        //여섯 명의 주자가 참가하지 못한 팀은 점수 계산에서 제외된다.
        //동점의 경우에는 다섯 번째 주자가 가장 빨리 들어온 팀이 우승하게 된다.


        //1.팀 번호로 배열이 들어온다.
        //2.여섯명이 안되면 탈락한다.
        //3.여섯명이 되면 상위 4명 점수만 합산, 동점일 때 5번째 주자 포함 계산
        //4.가장 낮은 점수가 우승


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i <testCnt ; i++) {
            int totalMember = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            teamScore = new HashMap<>();
            //1.팀 번호로 배열이 들어온다.
            for (int j = 0; j < totalMember ; j++) {
                int score = Integer.parseInt(st.nextToken());
                teamScore.putIfAbsent(score,new ArrayList<>());
                teamScore.get(score).add(j+1);
            }
            System.out.println(teamScore);

            int maxScore =0;
            int winner =0;

            for (Integer key: teamScore.keySet()) {
                //2.여섯명이 안되면 탈락한다.
                if(teamScore.get(key).size() < 6){
                    continue;
                }
                System.out.println(key);
                int sum =0;
                for (int j = 0; j < 4 ; j++) {
                    sum += teamScore.get(key).get(j);
                }
                System.out.println(sum);
            }
        }

        //3.여섯명이 되면 상위 4명 점수만 합산, 동점일 때 5번째 주자 포함 계산

        //4.가장 낮은 점수가 우숭

    }



}
