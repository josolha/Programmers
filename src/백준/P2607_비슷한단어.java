package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P2607_비슷한단어 {

    //비슷한 단어 특징

    //1.구성이 같음
    //-> hashMap 으로 해결
    //2.한문자를 더하거나,빼거나,하나의 문자를 다른 문자로 바꾸거나
    //-> 그럼 기존꺼에 더하거나 뺀다는게 뭘까. 어떻게 해결해야함???
    //-> 하니의 문자를 더하거나, 하나의 문자를 빼거나, 하나의 문자를 바꾸어도된다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int cnt = Integer.parseInt(br.readLine());
        String[] arr = new String[cnt];

        for (int i = 0; i <cnt ; i++) {
            arr[i] = br.readLine();
        }
        System.out.println(Arrays.toString(arr));

        Map<Character,Integer> fistMap = new HashMap<>();
        char[] chars = arr[0].toCharArray();

        for (int j = 0; j < chars.length ; j++) {
            fistMap.put(chars[j],fistMap.getOrDefault(chars[j],0)+1);
        }
        System.out.println(fistMap);

        int answer =0;

        for (int i = 1; i <cnt; i++) {
            Map<Character,Integer> otherMap = new HashMap<>();
            char[] temp = arr[i].toCharArray();
            for (int j = 0; j < temp.length ; j++) {
                otherMap.put(temp[j],otherMap.getOrDefault(temp[j],0)+1);
            }
            int totalDiff = 0;

            //1.첫 맵에만 있는 모든거 확인 (첫번째 기준)
            for (char c : fistMap.keySet()) {
                int diff = fistMap.get(c) - otherMap.getOrDefault(c,0);
                totalDiff += Math.abs(diff);
            }

            //2.다른 맵에 만 있는거 확인 (다른거 기준)
            for (char c : otherMap.keySet()){
                if(!fistMap.containsKey(c)){
                    totalDiff += otherMap.get(c);
                }
            }
            //여기서 문제 발생함.(한 문자가 두 번 추가되는 경우에도 틀리다고 나옴)

            if (totalDiff <= 2 && Math.abs(arr[0].length() - arr[i].length()) <= 1) {
                answer++;
            }
            System.out.println(otherMap);
        }

        System.out.println(answer);


    }
}
