package LEVEL2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class JadonCase문자열만들기 {
    public static void main(String[] args) {
        JadonCase문자열만들기 sl = new JadonCase문자열만들기();

        String s = "3people    unFollowed me";
        String answer = "";
        String[] a  = s.split(" ");
        StringBuffer bf = new StringBuffer();
        System.out.println(Arrays.toString(a));
        }

//        sl.solution(s);


    public String solution(String s) {

        String answer = "";

        String a[] = s.split(" ");

        System.out.println(Arrays.toString(a));
        System.out.println("a =" + a[1]);

        for (int i = 0; i < a.length; i++) {


            if (Character.isDigit(a[i].charAt(0)) == true) {
                answer += " " + a[i];
                i++;
            }
            answer += " " + Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1, a[i].length()).toLowerCase();
        }
            answer = answer.trim();
            System.out.println(answer);
            return answer;
        }
    }

//    JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
//    단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
//    문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.