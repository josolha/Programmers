package 백준;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {
    /*   큐 (FIFO) - 먼저 들어온것이 먼저 나간다.

        LinkedList, PriorityQueue, ArrayDeque 구현체를 가져야함

        add() : 큐가 꽉차면 IllegalStateException을 발생 -> 공간이 확신할때 사용하는게 좋다.
        offer() : 큐가 공간이 없으면 false를 반환 -> 충분한지 확인하지 않고 원소를 추가하려 할때 사용.
        remove() : 원소를 제거하고 그 원소 반환 -> 비어있으면 NoSuchElementException 발생
        poll() : 원소를 제거하고 그 원소를 반환 -> 예외 발생 x , null 반환 (비어있는지 잘 모를떄 사용)

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCard = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= totalCard ; i++) {
            queue.add(i);
        }

        //0.남은 카드가 하나일때까지 반복
        while(queue.size() > 1) {
            //1.맨앞을 버림
            queue.poll();

            //2.맨앞을 맨뒤로 이동
            Integer nextFront = queue.poll(); // 그 다음 맨 앞 숫자 제거하고 저장
            queue.add(nextFront); // 저장한 숫자를
        }
        System.out.println(queue.peek());
    }
}
