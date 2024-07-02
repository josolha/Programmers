package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.plaf.IconUIResource;

public class P19637_IF문좀대신써줘 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <a ; i++) {
            st = new StringTokenizer(br.readLine());
            String grade = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            map.put(grade,score);
        }
        //System.out.println(map);
        //System.out.println(map);
        for (int i = 0; i < b; i++) {
            int nums = Integer.parseInt(br.readLine());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (nums <= entry.getValue()) {
                    sb.append(entry.getKey());
                    if (i < b - 1) {  // 마지막 입력이 아닐 때만 줄바꿈 추가
                        sb.append("\n");
                    }
                    break;
                }
            }
        }
        System.out.print(sb.toString());

    }
}
