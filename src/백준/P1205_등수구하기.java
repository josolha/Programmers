package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1205_등수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 현재 점수의 개수
        int tasuScore = Integer.parseInt(st.nextToken()); // 태수의 새로운 점수
        int P = Integer.parseInt(st.nextToken()); // 최대 저장 가능한 점수 개수

        List<Integer> scores = new ArrayList<>();
        if (N > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                scores.add(Integer.parseInt(st.nextToken()));
            }
        }

        // 1.점수 리스트가 비어있는 경우
        if (N == 0) {
            System.out.println(1);
            return;
        }
        // 2.점수 리스트의 최하위 점수가 태수의 점수보다 높거나 동일하고, 리스트가 꽉 찼을 경우
        if (N == P && tasuScore <= scores.get(N - 1)) {
            System.out.println(-1);
            return;
        }

        // 메인 등수 출력 코드
        int rank = 1;
        for (int i = 0; i < N; i++) {
            if (i > 0 && !scores.get(i).equals(scores.get(i - 1))) {
                rank = i + 1;
            }
            if (tasuScore >= scores.get(i)) {
                System.out.println(rank);
                return;
            }
        }

        //태수의 점수가 모든 점수보다 낮은 경우
        if (N < P) {
            System.out.println(N + 1); // 모든 점수보다 낮고, 공간이 있을 때
        }
    }
}
