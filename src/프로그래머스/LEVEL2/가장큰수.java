package 프로그래머스.LEVEL2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static void main(String[] args) {

        가장큰수 sl = new 가장큰수();

        int[] numbers = {6,10,2};

        sl.solution(numbers);
    }

    public String solution(int[] numbers) {

        String answer = "";

        String[] str = new String[numbers.length]; //3

        for (int i = 0; i < str.length ; i++) {
            str[i] =String.valueOf(numbers[i]);
            System.out.println(str[i]);
        }
        Arrays.sort(str, new Comparator<String>() { // 6,10,2
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
                // 303 .compareTo 330
            }
        });

        for(String arr : str ){
            answer +=arr;
            System.out.println(answer);
        }

        return answer;
    }
}
