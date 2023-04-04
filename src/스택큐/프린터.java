package 스택큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class 프린터 {

    public int solution(int[] priorities, int location) {
        int answer = 0;

        List<Printjob> printer = new ArrayList<Printjob>();

        for (int i = 0; i < priorities.length; i++) {
            printer.add(new Printjob(i, priorities[i]));
        }

        int turn = 0;
        while(!printer.isEmpty()){
            System.out.println("printer = " + printer.toString());
            System.out.println("==================");
            System.out.println("turn = " + turn);
            Printjob job = printer.remove(0);
            boolean hasHighPriority = false;
            for (int i = 0; i < printer.size() ; i++) {
                if(printer.get(i).priority > job.priority ){
                    printer.add(job);
                    hasHighPriority = true;
                    break;
                }
            }
            if(!hasHighPriority){
                turn++;
                if(location == job.location){
                    break;
                }
            }
        }

        System.out.println(turn);
        return turn;
    }

    class Printjob{
        int priority;
        int location;

        public Printjob(int location, int priority){
            this.location = location;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Printjob{" +
                    "priority=" + priority +
                    ", location=" + location +
                    '}';
        }



    }

    public static void main(String[] args) {
        프린터 프린터 = new 프린터();

        /*

         문서: A B C D
         우선 순위 : 2 1 3 2

         인쇄 :

         조건  : 맨앞 꺼내고 높은 문서 존재 시 마지막에 넣는다 아니면 출력.

             1) A를 꺼내고 그것보다 큰게 있으니 맨뒤로 감
                B C D A
                1 3 2 2
             2) B를 꺼내고 그것보다 큰게 있으니 맨뒤로 감
                C D A B
                3 2 2 1
             3) C를 꺼내고 그것보다 큰게 없으니 인쇄에 넣음

                인쇄 :  C
                       3
             4) D를 꺼내고 그것보다 큰게 없으니 인쇄에 넣음
                 D A B
                 2 2 1

                인쇄 : C D
                      3 2
             5) A를 꺼내고 그것보다 큰게 없으니 인쇄에 넣음
                 A B
                 2 1

                인쇄 : C D A
                      3 2 2

         현재 대기목록 위치 : location 2
         답은 : answer 1

         */
        int[] priorities = {2,1,3,2};
        int location = 2;
        프린터.solution(priorities,location);
    }
}
