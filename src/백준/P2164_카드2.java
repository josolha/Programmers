package 백준;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cardCnt = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < cardCnt+1 ; i++) {
            queue.offer(i);
        }
        while (queue.size()>1){
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
