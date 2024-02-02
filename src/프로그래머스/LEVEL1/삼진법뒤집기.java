package 프로그래머스.LEVEL1;

public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();

        sb.append(Integer.toString(n,3));

        sb.reverse();
        System.out.println(sb);

        answer = Integer.parseInt(sb.toString(),3);

//        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        삼진법뒤집기 sl = new 삼진법뒤집기();
        int n = 45;

        sl.solution(n);
    }

}
