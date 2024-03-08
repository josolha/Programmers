package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P23971_ZOAC4 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //n과m이 0일때 N *M 의 표의 다 채우는거야
        Long hi = (long) Math.ceil((double) W / (M + 1));
        Long verti = (long) Math.ceil((double) H / (N + 1));
        System.out.println(hi * verti);

    }
}
