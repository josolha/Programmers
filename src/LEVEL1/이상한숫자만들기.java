package LEVEL1;

import sun.util.resources.cldr.nus.CalendarData_nus_SD;

import java.util.Arrays;
import java.util.Locale;

public class 이상한숫자만들기 {
    public String solution(String s) {
        String answer ="";
        String[] ab = s.split("");
        int idx = 0;


        for (int i = 0; i <ab.length ; i++) {
            if(ab[i].equals(" ")){
                idx = 0;
                answer += " ";
            }else if(idx%2==0){
                answer += ab[i].toUpperCase();
                idx ++;
            }else{
                answer += ab[i].toLowerCase();
                idx ++;
            }

        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        이상한숫자만들기 sl = new 이상한숫자만들기();
        String s = "try hello world";
        sl.solution(s);
        char a = 'i';


    }
}
