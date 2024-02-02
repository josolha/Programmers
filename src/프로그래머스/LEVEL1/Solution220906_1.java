package 프로그래머스.LEVEL1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution220906_1{

    public String solution(int[] numbers) {

        String answer = "";

        // 1. 입력 데이터를 문자열 배열로 변환.
        String[] str = new String[numbers.length];
        for(int i = 0 ; i<str.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }

        // 2. Comparator 인터페이스로 정렬 기준을 설정.
        Arrays.sort(str,new Comparator<String>(){
            // 예제 입력1에서 6과 10을 생각해보면 o2가 6, o1이 10이 된다. 이를 지속해서 반복.
            @Override
            public int compare(String o1,String o2){
                System.out.println(o1+","+o2+"와"+o2+","+o1);
                return (o1+o2).compareTo(o2+o1);
            }
        });

        // 3. 모든 문자열을 연결한다.
        for(String arr : str)
            answer+=arr;

        // 4. 입력 데이터가 모두 0인 경우 예외 처리.
//        if(str[0].equals("0")) answer = "0";

        System.out.println(" 결과값 "+answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution220906_1 sl = new Solution220906_1();
        int[] a = {6,10,2};
        sl.solution(a);
        // 6 -1 , 1-0,
    }
}