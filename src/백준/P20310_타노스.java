package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P20310_타노스 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        char[] arr = a.toCharArray();

        StringBuffer sb = new StringBuffer();

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for (Character character : map.keySet()) {
            map.replace(character,map.get(character)/2);
        }

        for (Character character : map.keySet()) {
            for (int i = 0; i <map.get(character) ; i++) {
                sb.append(character);
            }
        }

        //System.out.println(map);
        System.out.println(sb);



    }
}

