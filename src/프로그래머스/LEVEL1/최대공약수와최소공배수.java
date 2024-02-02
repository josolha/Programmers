package 프로그래머스.LEVEL1;

public class 최대공약수와최소공배수 {

    public int[] solution(int n, int m) {
        // 유클리드 호제법
        // 2개 자연수 최대공약수를 구하는 알고리즘 중 하나
        // A를 B로 나눈 나머지를 R이라고 하면 (A>B), A와 B의 최대공약수는 B와 R의 최대공약수와 같다.

        // 1.매개변수 a,b를 받는다.(단 a>b)
        // 2.b가 0이라면, a가 최대 공약수
        // 3.b가 0이 아니라면, 1번의 매개변수에 'b'와 'a%b'를 전달한다.
        // 4.위 내용을 반복한다.

        int a = Math.max(n,m);
        int b = Math.min(n,m);

        while(b!=0)
        {
            int r = a%b;
            a=b;
            b=r;
        }

        int[] answer = {a,n*m/a};

        return answer;
    }

    public static void main(String[] args) {
        최대공약수와최소공배수 sl = new 최대공약수와최소공배수();
        int n = 13;
        int m = 39;
        sl.solution(n,m);

    }
}
