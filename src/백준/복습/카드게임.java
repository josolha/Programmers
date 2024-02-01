package 백준.복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드게임 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long number = scanner.nextLong();

        Queue<Long> queue = new LinkedList<>();

        for (int i = 1; i <= number; i++) {
            queue.add((long) i);
        }
//        System.out.println(queue);

        while(queue.size() > 1) {
            queue.poll();
            Long temp = queue.poll();
            queue.add(temp);
        }
        System.out.println(queue.peek());
    }

}
