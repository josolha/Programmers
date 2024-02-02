package 프로그래머스.LEVEL2;

public class k진수에서소수개수구하기 {

        public int solution(int n, int k) {

            int answer = 0;
            String jinsu = Integer.toString(n, k);
            String[] spiltJinsu = jinsu.split("0");

            for (int i = 0; i < spiltJinsu.length; i++) {
                if (spiltJinsu[i].equals("")) {
                    continue;
                }
                if (isPrime(Long.parseLong(spiltJinsu[i])) == 1) {
                    answer++;
                }
            }
            System.out.println(answer);
            return answer;
        }

        public int isPrime(long n) {
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            if (n == 1) {
                return 0;
            }
            return 1;
        }
    public static void main(String[] args) {
        k진수에서소수개수구하기 sl = new k진수에서소수개수구하기();
        int n = 437674;
        int k = 3;
        sl.solution(n,k);
    }
}

