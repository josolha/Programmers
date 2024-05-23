package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class P9017_크로스컨트리 {
    static int[] scoreList;

    static Map<Integer,List<Integer>> teamScore;

    static Map<Integer,Integer> teamCnt;

    static int[] result;

    static List<Integer> highList;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCnt = Integer.parseInt(st.nextToken());
        result = new int[testCnt];
        for (int i = 0; i <testCnt ; i++) {
            teamCnt = new HashMap<>();

            st = new StringTokenizer(br.readLine());
            int totalMember = Integer.parseInt(st.nextToken());
            scoreList = new int[totalMember];
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < totalMember ; j++) {
                int score = Integer.parseInt(st.nextToken());
                scoreList[j] = score;
                teamCnt.put(score,teamCnt.getOrDefault(score,0)+1);

            }
            System.out.println("scoreList = " + Arrays.toString(scoreList));
            System.out.println("teamCnt = " + teamCnt);
            highList = new ArrayList<>();
            teamScore = new HashMap<>();
            for (Integer integer : teamCnt.keySet()) {
                if(teamCnt.get(integer) >= 6){
                    highList.add(integer);
                }
            }
           System.out.println("highList ="+highList);
            int score = 1;
            for (int j = 0; j <scoreList.length ; j++) {
                for (int k = 0; k < highList.size() ; k++) {
                    if(scoreList[j] == highList.get(k)){
                        teamScore.putIfAbsent(scoreList[j], new ArrayList<>());
                        teamScore.get(scoreList[j]).add(score++);
                    }
                }
            }

            System.out.println("teamScore = " + teamScore);

            int minValue = Integer.MAX_VALUE;
            int minTeam = 0;
            int fifthScoreMin = Integer.MAX_VALUE; // 5번째 선수의 최소 점수를 저장할 변수

            for (Integer integer : teamScore.keySet()) {
                //System.out.println("integer = " + integer);
                int tempValue = 0;
                for (int j = 0; j <4 ; j++) {
                    //System.out.println("teamScore.get(integer).get(j) = " + teamScore.get(integer).get(j));
                    tempValue += teamScore.get(integer).get(j);
                }
                int fifthScore = teamScore.get(integer).get(4); // 5번째 선수의 점수
                // System.out.println("tempValue = " + tempValue);
                if (tempValue < minValue || (tempValue == minValue && fifthScore < fifthScoreMin)) {
                    minValue = tempValue;
                    minTeam = integer;
                    fifthScoreMin = fifthScore; // 5번째 선수의 점수를 업데이트
                }
            }
            result[i] = minTeam;
        }
        for (int i : result) {
            System.out.println(i);
        }


    }



}
