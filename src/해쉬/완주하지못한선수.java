package 해쉬;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
//        Solution_Hash sol = new Solution_Hash();
//        System.out.println(sol.solution(part,comp));
        Solution2 sol = new Solution2();
        sol.solution(part,comp);

    }
}
// 중요 포인트(1)
// Map에 값을 전체 출력하기 위해서는 entrySet(),keySet() 메소드를 사용하면 되는데
// entrySet() 메서드는 key와 value의 값이 모두 필요한 경우 사용하고,
// keySet() 메서드는 key의 값만 필요한 경우 사용한다.

// 중요 포인트(2)
// getOrDefault => value가 없으면 defaultValue를 넣어줌

class Solution_Hash{
    public String solution(String[] participant, String[] completion) {

        String answer ="";

        HashMap<String,Integer> map = new HashMap<>();
        for (String player : participant ) {
            map.put(player,map.getOrDefault(player,0)+1);
        }
        for (String player : completion ) {
            map.put(player, map.get(player) - 1);
        }
        System.out.println(map);

//       (1)
//        for (String key : map.keySet()) {
//            if(map.get(key)!=0);
//                answer += key;
//                break;
//        }

//      (2)
//        for (Map.Entry<String,Integer> entry : map.entrySet()) {
//            if(entry.getValue()!=0){
//                answer += entry.getKey();
//            }
//        }

//      (3)
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Integer> entry =iter.next();
            if(entry.getValue()!=0){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}
class Solution2{
    public String solution(String[] participant, String[] completion){
        String answer ="";
        Map<String,Integer> map = new HashMap<>();
        for (String player : participant ) {
            map.put(player,map.getOrDefault(player,0)+1);
        }
        for (String player : completion){
            map.put(player,map.get(player)-1);
        }
        for (Map.Entry<String,Integer> entry :map.entrySet() ) {
            if(entry.getValue() != 0){
                answer += entry.getKey();
            }

        }
        System.out.println(map);
        System.out.println(answer);


        return answer;
    }
}

