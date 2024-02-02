package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 슈퍼바이러스2 {

    static Long k;
    static Long p;
    static Long n;

    public static void main(String[] args) throws IOException {
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//
//        //바이러스 수
//        k = Long.valueOf(stringTokenizer.nextToken());
//        //증가율
//        p = Long.valueOf(stringTokenizer.nextToken());
//        //총시간
//        n = Long.valueOf(stringTokenizer.nextToken());

        System.out.println(fast_pow(2L,3L));
        System.out.println(1%2);

    }

    private static Long fast_pow(Long a, Long b) {
        Long result = 1L;
        while(b > 0){
            if(b % 2 == 1){
               result *= a;
            }
            a *= a;
            b/=2;
        }
        return result;
    }
}
