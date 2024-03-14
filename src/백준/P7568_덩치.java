package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class P7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int numCnt = Integer.parseInt(st.nextToken());

        Map<Integer,int[]>hashMap = new HashMap<>();
        int[] rank = new int[numCnt];

        for (int i = 0; i < numCnt; i++) {
            st = new StringTokenizer(bf.readLine());
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            hashMap.put(i+1,arr);
        }
        for (Integer keys:
             hashMap.keySet()) {
            System.out.println(keys+" "+Arrays.toString(hashMap.get(keys)));
        }

        Collections.sort(hashMap, new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
