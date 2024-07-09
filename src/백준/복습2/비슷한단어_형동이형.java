package 백준.복습2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비슷한단어_형동이형 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());
        String S = br.readLine();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String T = br.readLine();
            int[] alpha = new int[26];

            for (int j = 0; j < S.length(); j++) {
                alpha[S.charAt(j) - 'A']++;
            }
            // DOG
            // GOOD
            // DOLL
            // GOD
            int difSum = 0;
            for (int j = 0; j <T.length() ; j++) {
                if(alpha[T.charAt(j) - 'A']>0){
                    difSum++;
                    alpha[T.charAt(j)-'A']--;
                }
            }
            if (T.length() == S.length() && (difSum == S.length() || difSum == S.length() - 1)) {
                answer++;
            } else if (S.length() == T.length() - 1 && difSum == T.length() - 1) {
                answer++;
            } else if (S.length() == T.length() + 1 && difSum == T.length()) {
                answer++;
            }

        }
        System.out.println(answer);
    }
}
