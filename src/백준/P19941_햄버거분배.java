package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19941_햄버거분배 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int near = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] list = st.nextToken().toCharArray();

        boolean[] visited = new boolean[cnt];
        int answer = 0;

        // 가장 왼쪽부터 탐색하며 처리
        for (int i = 0; i < cnt; i++) {
            if (list[i] == 'P') {
                // 현재 사람의 왼쪽부터 탐색하여 햄버거를 찾음
                for (int j = Math.max(0, i - near); j < i; j++) { //맨왼쪽 막힘 방지
                    if (list[j] == 'H' && !visited[j]) {
                        visited[j] = true;
                        answer++;
                        break;
                    }
                }
                // 왼쪽에 햄버거가 없을 경우에만 오른쪽을 탐색
                if (!visited[i]) {
                    for (int j = i + 1; j <= Math.min(cnt - 1, i + near); j++) {//맨 오른쪽 막힘 방지
                        if (list[j] == 'H' && !visited[j]) {
                            visited[j] = true;
                            answer++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
