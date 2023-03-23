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

        //1.옷을 종류별로 구분한다.
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < clothes.length ; i++) {
            hashMap.put(clothes[i][1],hashMap.getOrDefault(clothes[i][1],0)+1);
        }
        System.out.println(hashMap);

        //2.입지 않는 경우를 추가해서 모든 조합을 계산한다.
        for (String s : hashMap.keySet()) {
            answer *= hashMap.get(s) +1;
        }

        //3. 아무종류의 옷도 입지 않는 경우 제외
        answer -= 1;
         /*
            단순하게 곱하게 되면 해당 의류가 없을때 경우의 수가 없음
            예) 옷 : 노랑,블루   안경 : 검정,흰색  일때
              여기서 곱하기의 의미는 (노랑,검정) (노랑,흰색), (블루,검정),(블루,흰색) 4가지로 나온다
              하지만 해당 문제에서는 노랑만, 블루만, 검정만, 흰색만 착용했을 경우의 수가 포함된다.
              따라서 옷 : 노랑,블루,(없음)   안경 : 검정,흰색,(없음) 함으로써
              해결할수 있음.
              !!마지막으로 (없음,없음) 의 경우의 수를 제외(-1) 해야함!!
         */
        return answer;
    }
}

