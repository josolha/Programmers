package LEVEL1;

public class 두정수사이의합 {

    public long solution(int a, int b) {

        long answer = 0;

        int max = Math.max(a,b);
        int min = Math.min(a,b);

        for (int i = min; i < max+1; i++) {
            answer += i;

        }
        return answer;

    }
    public static void main(String[] args) {
        두정수사이의합 sl = new 두정수사이의합();

        int a = 5;
        int b = 3;

        sl.solution(a,b);

    }

}
