package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4659_비밀번호발음하기 {

    static String aeiou = "aeiou";
    static String input ="";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String input = bf.readLine();

            if(input.equals("end")){
                break;
            }
            if(include(input) && continuity(input) && exceptEEAndOO(input)){
                System.out.printf("<%s> is acceptable.\n",input);
            }else{
                System.out.printf("<%s> is not acceptable.\n",input);
            }
        }
    }


    private static boolean include(String input){
        //모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
        for (int i = 0; i <input.length() ; i++) {
                if(aeiou.indexOf(input.charAt(i))!=-1){
                    return true;

                }
        }
        return false;
    }

    private static boolean continuity(String input){
        //모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
        int aeiouCnt=0;
        int aeiouNotCnt =0;
        for (int i = 0; i <input.length() ; i++) {
            if(aeiou.indexOf(input.charAt(i))!=-1){
                aeiouCnt++;
                aeiouNotCnt =0;
            }else{
                aeiouNotCnt++;
                aeiouCnt=0;
            }
            if(aeiouCnt >= 3 || aeiouNotCnt >=3){
                return false;
            }
        }
        return true;
    }

    private static boolean exceptEEAndOO(String input){
        //같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
        char prevChar = '0';

        for (int i = 0; i <input.length() ; i++) {
            char currentChar = input.charAt(i);

            if (prevChar == currentChar && !(prevChar == 'e' || prevChar == 'o')) {
              return false;
            }
            prevChar =currentChar;
        }
        return true;

    }
}
