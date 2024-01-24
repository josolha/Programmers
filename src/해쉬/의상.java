package 해쉬;

import java.util.HashMap;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes =  {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        의상_Solution sl = new 의상_Solution();
        System.out.println(sl.solution(clothes));
    }
}
class 의상_Solution{

    HashMap<String,Integer> hashMap= new HashMap<>();

    int answer = 1;

    public int solution(String[][] clothes) {
        for (int i = 0; i <clothes.length ; i++) {
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1],0)+1);
        }
        System.out.println(hashMap.toString());

        for (String map: hashMap.keySet()) {
            answer *= hashMap.get(map) +1;
            System.out.println(answer);
        }
        return answer -1;
    }
}
