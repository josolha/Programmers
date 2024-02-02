package 프로그래머스.LEVEL2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 더맵게복습 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
//        더맵게복습_Solution sl = new 더맵게복습_Solution();
//        System.out.println(sl.solution(scoville, K));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());

    }

}
class 더맵게복습_Solution{
    PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
    int[] scoville;
    int K;

    public int solution(int[] scoville, int K) {
        this.scoville = scoville;
        this.K = K;

        for (int x: scoville) {
            priorityQueueLowest.add(x);
        }
        int answer = 0;

        while(priorityQueueLowest.peek() <K){
            if(priorityQueueLowest.size() ==1){
                return -1;
            }
            answer++;
            priorityQueueLowest.add(priorityQueueLowest.poll() + priorityQueueLowest.poll()*2);
            System.out.println(priorityQueueLowest);

        }
        return answer;
    }
}
