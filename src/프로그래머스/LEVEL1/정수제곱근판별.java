package 프로그래머스.LEVEL1;

public class 정수제곱근판별 {

    public long solution(long n) {
        long answer = 0;

        long a = (long)Math.sqrt(n); // 11

        if (a*a == n) {
            answer = (a + 1) *(a + 1);
        }else{
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        정수제곱근판별 sl = new 정수제곱근판별();

        long n = 3;

        sl.solution(n);


        double a = Math.sqrt(n);

        System.out.println(a*a);

    }
}
