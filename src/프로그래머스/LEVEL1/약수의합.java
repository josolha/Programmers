package 프로그래머스.LEVEL1;

public class 약수의합 {

        public int solution(int n) {

            int answer = 0;

            for (int i = 1; i < n+1 ; i++) {
                if (n%i==0){
                    answer += i;
                }
            }
            return answer;
        }

        public static void main(String[] args) {
            약수의합 sl = new 약수의합();
            int a = 12;
            sl.solution(a);

        }
}
