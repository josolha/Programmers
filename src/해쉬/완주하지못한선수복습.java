package 해쉬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 완주하지못한선수복습 {
    public static void main(String[] args) {
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion =  {"stanko", "ana", "mislav","test"};
    완주하지못한선수복습_Solution sl = new 완주하지못한선수복습_Solution();
    System.out.println(sl.solution(participant,completion));

    }
}
class 완주하지못한선수복습_Solution{

    String answer;
    String[] participant;
    String[] completion;

    Map<String,Integer> map;

    public String solution(String[] participant, String[] completion) {
        this.participant = participant;
        this.completion = completion;
        map = new HashMap<>();

        for (int i = 0; i <participant.length ; i++) {
            if(map.containsKey(participant[i])) {
                map.put(participant[i], map.get(participant[i]) + 1);
                continue;
            }
            map.put(participant[i],1);
        }
        System.out.println(map.toString());
        for (String player: completion) {
            if(map.containsKey(player)){
                map.put(player,map.get(player)-1);
            }
        }
        for (String player : map.keySet() ) {
            if(map.get(player) !=0){
                answer = player;
                break;
            }
        }
        System.out.println(map.toString());
        return answer;
    }
    public String solution2(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}

//class Solution {
//    public String solution(String[] participant, String[] completion) {
//
//        String answer = "";
//        HashMap<String,Integer> map = new HashMap<>();
//
//        for(String player : participant)
//            map.put(player,map.getOrDefault(player,0)+1);
//
//        for(String player : completion)
//            map.put(player,map.get(player)-1);
//
//        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
//
//        while(iter.hasNext()){
//            Map.Entry<String, Integer> entry = iter.next();
//            if (entry.getValue() != 0){
//                answer = entry.getKey();
//                break;
//            }
//        }
//        return answer;
//    }
//}
