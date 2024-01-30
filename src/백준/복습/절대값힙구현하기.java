package 백준.복습;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 절대값힙구현하기 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1,o2)->{

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if(first_abs == second_abs){
                //오버플로우 발생 가능성 있음
//           return o1-o2;
                return o1 > o2 ? 1 : -1;
//                return Integer.compare(o1,o2);
            }
            return first_abs-second_abs;
        });

        for (int i = 0; i <total ; i++) {
            int temp = scanner.nextInt();
            if(temp == 0){
                if(priorityQueue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(priorityQueue.poll());
                }
            }else{
                priorityQueue.add(temp);
            }
        }


    }
}
