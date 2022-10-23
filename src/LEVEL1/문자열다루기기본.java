package LEVEL1;

import com.sun.media.sound.RIFFReader;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() ==4 || s.length() ==6 ){
            answer = true;
            answer = s.matches("^[0-9]*$");
        }else{
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열다루기기본 sl = new 문자열다루기기본();

        String s = "a1234";

        sl.solution(s);
    }
}

