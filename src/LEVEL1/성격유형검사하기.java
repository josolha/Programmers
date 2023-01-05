package LEVEL1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class 성격유형검사하기 {

    public static void main(String[] args) {
        성격유형검사하기 성격유형검사하기 = new 성격유형검사하기();
   /*
        given => survey :  ["AN", "CF", "MJ", "RT", "NA"]
        when  => choices : [ 5,    3,    2,    7,    5]
                             1     1     2     3    1
        then  => "TCMA"



        1. 점수 지급 방법
        (123 일때는 앞에 유형에 321점 획득, 456일때는 뒤에 유형에 123점 획득)
        수식 => 3으로 나눈값이 1일때는 0점,
               만약 3보다 클때 3으로 나눈 값

        설문 : 1,2,3,(4),5,6,7
        점수 : 3,2,1,(0),1,2,3

        -3,-2, -1, 0  4, 4, 4

        N = 1, C =1, M =2, T=3, A =1

        2. 결과
        ==================================
        지표 번호	성격 유형	점수	성격 유형	점수

        1번 지표	라이언형(R)	0	튜브형(T)	3
        2번 지표	콘형(C)	    1	프로도형(F) 0
        3번 지표	제이지형(J)	0	무지형(M)	2
        4번 지표	어피치형(A)	1	네오형(N)	1
        ==================================

        3. 주의사항
        *점수가 같을 시 앞에것
    */

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices2 = {7,1,3};

        성격유형검사하기.solution(survey,choices);

    }

    public String solution(String[] survey, int[] choices) {

        String answer = "";

        Map<Character,Integer> typeScore = new HashMap<>();

        choices = Arrays.stream(choices).map(a->a-4).toArray();

        for (int i = 0; i < choices.length; i++) {

            if((choices[i]) < 0){
                char tempChar = survey[i].charAt(0);
                typeScore.put(tempChar,typeScore.getOrDefault(tempChar,0)+Math.abs(choices[i]));
            }
            if((choices[i]) > 0){
                char tempChar = survey[i].charAt(1);
                typeScore.put(tempChar,typeScore.getOrDefault(tempChar,0)+choices[i]);
            }
//            if(choices[i]-4 ==0){
//                typeScore.put(survey[i].substring(0,1),typeScore.getOrDefault(survey[i].substring(0,1),0)+ 0);
//                typeScore.put(survey[i].substring(1,2),typeScore.getOrDefault(survey[i].substring(1,2),0)+ 0);
//            }
        }
        answer += typeScore.getOrDefault('R',0) >= typeScore.getOrDefault('T',0) ? "R" : "T";
        answer += typeScore.getOrDefault('C',0) >= typeScore.getOrDefault('F',0) ? "C" : "F";
        answer += typeScore.getOrDefault('J',0) >= typeScore.getOrDefault('M',0) ? "J" : "M";
        answer += typeScore.getOrDefault('A',0) >= typeScore.getOrDefault('N',0) ? "A" : "N";

        System.out.println("typeScore = " + typeScore);
        System.out.println("answer = " + answer);

        return answer;
    }

}
