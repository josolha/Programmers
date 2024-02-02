package 프로그래머스.LEVEL1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {

    public long solution(long n) {

        long answer = 0;

        String[] a2 = Long.toString(n).split("");
        Arrays.sort(a2);


        StringBuffer sb = new StringBuffer();

        for (int i = 0; i <a2.length ; i++) {
            sb.append(a2[i]);
        }

        sb.reverse();

        System.out.println(answer = Long.parseLong(sb.toString()));

        return answer;
    }

    public static void main(String[] args) {
        정수내림차순으로배치하기 sl = new 정수내림차순으로배치하기();

        long df = 118372;

        sl.solution(df);

        char a = '1';
        String ab = "123";
        int c = 1;

        System.out.println(ab.getClass());



    }
}