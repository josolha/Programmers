package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P22233_가희와키워드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < a ; i++) {
            hashSet.add(br.readLine());
        }

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine(),",");

            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                hashSet.remove(token);

            }
            System.out.println(hashSet.size());
        }
    }
}
