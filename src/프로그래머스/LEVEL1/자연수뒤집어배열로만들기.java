package 프로그래머스.LEVEL1;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

    public int[] solution(long n) {

        String a = "" + n; // n을 문자열로 치완 -> 길이 설정
        int[] answer = new int[a.length()];
        int cnt = 0;

        while(n>0){
            answer[cnt] = (int)n%10; // 12345 -> 5 , 1234 -> 4, 123 -> 3, 12-> 2, 1 -> 1
            n/=10; // 1234, 123,12,1,0
            System.out.println(n);
            cnt++;

        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        // 질문
        // 왜 getClass 논리 , 문자, 정수 , 실수형 안되는지. -> 스택에 저장되서 그런가?
        // 결론: stack , heap 저장 위치 문제

        // int  = primitive 자료형 (long, float, double ...) 기본 자료형은 stack 에 쌓임.
        // integer = Wrapper 클래스 (객체)

        자연수뒤집어배열로만들기 sl = new 자연수뒤집어배열로만들기();
        int a = 12345;
        int b = 123123123;
        sl.solution(a);
        sl.solution(b);

//        String str = "ABC"; // String 타입
//        Integer i = 123; // Integer 타입
//        int i2  = 123; // 안됨
//        Long i3 = new Long(123); // wrapper 감싼 후 사용 가능
//        System.out.println("String : "+str.getClass().getName()); // Type 확인
//        System.out.println("Integer : "+i.getClass().getName()); // Type 확인
//        System.out.println("long : "+i3.getClass().getName()); // Type 확인



    }
}
