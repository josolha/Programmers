package softeer;

public class 고속거듭제곱 {
    public static void main(String[] args) {
        System.out.println(fastPow(2,3,1000000007));
        System.out.println((int)Math.pow(2,3));
    }


    public static long fastPow(long base, long exponent, long mod) {
        long result = 1;
        base %= mod;

        while (exponent > 0) {
            if (exponent % 2 == 1) { // 홀수 지수 처리
                result = (result * base) % mod;
            }
            base = (base * base) % mod; // 지수를 절반으로 줄임
            exponent /= 2;
        }

        return result;
    }

}
