package LEVEL2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Collections;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
//        int answer = 0;
//        int cnt =0;
//
////       스코빌 지수 = 가장작은 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//
//        ArrayList<Integer> al = new ArrayList<>();
//
//        for (int x:scoville) {
//            al.add(x);
//        }
//
//        Collections.sort(al);
//        System.out.println();
//
//
//        while(al.get(0) < K){
//            if(al.size() < 2){
//                return -1;
//            }
//            int add = al.get(0) +(al.get(1) * 2);
//            al.remove(0);
//            al.remove(0);
//            al.add(add);
//            cnt++;
//            Collections.sort(al);
//        }
//
//        System.out.println(al);
//
//
//        return answer;
        int answer = 0;


        //낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        //높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
//        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        for (int x: scoville) {
            priorityQueueLowest.add(x);
        }
        while(priorityQueueLowest.peek() <K){
            if(priorityQueueLowest.size()<2){
                return -1;
            }
            int add = priorityQueueLowest.poll() + (priorityQueueLowest.poll()*2);
            priorityQueueLowest.add(add);
            answer++;

        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        더맵게 sl = new 더맵게();
        int[] scovile = {1,2,3,9,10,12};
        int k = 7;
        sl.solution(scovile,k);
    }

}
