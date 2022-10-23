package LEVEL1;

import java.util.HashMap;
import java.util.HashSet;

public class 숫자문자열과영단어 {
    public int solution(String s) {

        String[] arr = {"zero","one","two","three","four","five",
                "six","seven","eight","nine","ten"};
        for (int i = 0; i < arr.length ; i++) {
            s = s.replaceAll(arr[i],Integer.toString(i));
        }

        System.out.println(Integer.parseInt(s));

        System.out.println(s.getClass());

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        숫자문자열과영단어 sl = new 숫자문자열과영단어();
        String s = "one4seveneight";
        sl.solution(s);

    }
}
