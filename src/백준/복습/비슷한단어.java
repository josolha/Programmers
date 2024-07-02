package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 비슷한단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i] = br.readLine();
        }
        //System.out.println(Arrays.toString(arr));

        Map<Character,Integer> firstMap = new HashMap<>();
        char[] chars = arr[0].toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            firstMap.put(chars[i],firstMap.getOrDefault(chars[i],0)+1);
        }
        System.out.println(firstMap);

        int answer = 0;
        for (int i = 1; i <count; i++) {
            Map<Character,Integer> otherMap = new HashMap<>();
            char[] chares = arr[i].toCharArray();
            for (int j = 0; j < chares.length ; j++) {
                otherMap.put(chares[j],otherMap.getOrDefault(chares[j],0)+1);
            }
            System.out.println(otherMap);
            int diff = 0;

            //first - other 개수
            for (char c : firstMap.keySet()) {
                diff += Math.abs(firstMap.get(c) - otherMap.getOrDefault(c,0));

            }
            for(char c: otherMap.keySet()){
                diff += Math.abs(otherMap.get(c) - firstMap.getOrDefault(c,0));
            }

            //System.out.println(diff);
            if(diff <= 2){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
