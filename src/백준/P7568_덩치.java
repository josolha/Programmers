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
            hashMap.put(i,arr);
        }
//        for (Integer keys:
//             hashMap.keySet()) {
//            System.out.println(keys+" "+Arrays.toString(hashMap.get(keys)));
//        }
        for (int i = 0; i < hashMap.size() ; i++) {
            int cnt =1;
            for (int j = 0; j < hashMap.size() ; j++) {
                if(hashMap.get(i)[0] < hashMap.get(j)[0] && hashMap.get(i)[1] < hashMap.get(j)[1]){
                    cnt++;
                }
            }
            rank[i] = cnt;
        }
        for (int i = 0; i < rank.length ; i++) {
            System.out.print(rank[i]+" ");
        }

        //System.out.println("Arrays.toString(rank) = " + Arrays.toString(rank));

    }
}
