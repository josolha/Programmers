package 프로그래머스.LEVEL2;

import java.util.Arrays;

public class JadonCase문자열만들기2 {
    public static void main(String[] args) {
        JadonCase문자열만들기2 sl = new JadonCase문자열만들기2();
        sl.solution("3people unFollowed me");
//        int a =1;
//        int b =0;
//        int answer = 0;
//        boolean flag = true;
//        answer = flag ? a : b ;
//        System.out.println(answer);
//


    }

    public String solution(String s) {
        String answer = "";
//        // 각 단어의 첫글자만 제외하고는 소문자이므로
//        // 전체를 소문자로 먼저 만들어준다.
//        // 문자열 공백을 기준으로 잘라서 넣기
//        String[] str = s.toLowerCase().split("");
//        System.out.println(Arrays.toString(str));
//        // 이전이 공백인지 체크
//        boolean space = true;
//
//        for (String ss : str) {
//            // space가 true면 대문자로, 아니면 그냥 그대로 사용
//            answer =  answer + (space ? ss.toUpperCase() : ss);
//            // 공백이 오면 space를 true 아니면 false
//            space = ss.equals(" ") ? true : false;
//        }
//        System.out.println(answer);
        String[]a = s.toLowerCase().split("");
        System.out.println(Arrays.toString(a));
        boolean flag = true;

        for(String x : a){
            answer += flag ? x.toUpperCase():x;
            flag = x.equals(" ")? true : false;
        }
        System.out.println(answer);
        return answer;
    }
}
