package LEVEL1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = 0;

        int a = Integer.parseInt(s);
        answer = a;

//        if(a<0){
//            System.out.println(a);
//            return a;
//
//        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        문자열을정수로바꾸기 sl = new 문자열을정수로바꾸기();

        String s = "-1234";

        sl.solution(s);
//        System.out.println(s.charAt(0)=='1');
    }
}
