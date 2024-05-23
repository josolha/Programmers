package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P20920_영단어암기는괴로워 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int wordsCnt = Integer.parseInt(st.nextToken());
        int minSize = Integer.parseInt(st.nextToken());


        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < wordsCnt; i++) {
            String word = br.readLine().trim();
            if (word.length() >= minSize) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println(map);
        List<String> words = new ArrayList<>(map.keySet());
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (!map.get(o1).equals(map.get(o2))) {
                    return map.get(o2)- map.get(o1);
                }
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            sb.append(str + "\n");
        }
        System.out.println(sb);

    }
}
