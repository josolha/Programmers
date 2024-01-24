package 스택큐;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        프로세스_Solution sl = new 프로세스_Solution();
        System.out.println(sl.solution(priorities, location));


//        int answer = PrinterQueue.solution(priorities,location);
//        System.out.println(answer);
    }

}

class 프로세스_Solution {

//    PriorityQueue<Information> priorityQueue = new PriorityQueue<>((a,b) -> {
//        if(b.priority == a.priority){
//            return b.index - a.index;
//        }
//         return b.priority - a.priority;
//    });
//    int location;
//
//    int answer;
//
//    public int solution(int[] priorities, int location) {
//        this.location = location;
//        for (int i = 0; i < priorities.length ; i++) {
//            priorityQueue.add(new Information(i ,priorities[i]));
//        }
//
//        while (!priorityQueue.isEmpty()) {
//            Information info = priorityQueue.poll();
//            System.out.println(info);
//        }
//        return answer;
//    }
//
//    static class Information{
//        int index;
//        int priority;
//
//        public Information(int index, int priority) {
//            this.index = index;
//            this.priority = priority;
//        }
//
//        @Override
//        public String toString() {
//            return "{"+index +" , "+ priority+"}";
//        }
//
//        public int getIndex() {
//            return index;
//        }
//
//        public int getPriority() {
//            return priority;
//        }
//    }
    Queue<int[]> queue = new LinkedList<>();
    public int solution(int[] priorities, int location) {
        int answer = 0;
        for (int i = 0; i < priorities.length ; i++) {
            queue.offer(new int[]{priorities[i],i});
        }

//        for (int i = 0; i < priorities.length; i++) {
//            System.out.println(Arrays.toString(queue.poll()));
//        }

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            boolean isBestHigh = true;

            for (int[] p: queue) {
                if(p[0] > current[0]) {
                    isBestHigh = false;
                    break;
                }
            }
            if(!isBestHigh){
                queue.offer(current);
            }else{
                answer++;
                if(current[1] == location){
                    return answer;
                }
            }

            }

        return answer;
    }




}

class PrinterQueue {
    public static int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean isHighestPriority = true;

            for (int[] p : queue) {
                if (p[0] > current[0]) {
                    isHighestPriority = false;
                    break;
                }
            }
            if (!isHighestPriority) {
                queue.offer(current);
            } else {
                answer++;
                if (current[1] == location) {
                    return answer;
                }
            }
        }

        return -1;
    }
}

