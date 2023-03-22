package 해쉬;

import java.util.Arrays;
import java.util.HashMap;

public class 위장  {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        위장 위장 = new 위장();
        System.out.println(위장.solution(clothes2));



    }
    public int solution(String[][] clothes) {
        int answer = 1;
        int multy =1;
        int plus = 0;

        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < clothes.length ; i++) {
            hashMap.put(clothes[i][1],hashMap.getOrDefault(clothes[i][1],0)+1);
        }
        System.out.println(hashMap);

        for (String s : hashMap.keySet()) {
            answer *= hashMap.get(s) +1;
//            answer = 곱합값 + (더한값);
        }
        answer -= 1;
        
        return answer;
    }
}

