package 스택큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발복습 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        기능개발복_Solution sl = new 기능개발복_Solution();
        sl.solution(progresses,speeds);
    }
}
class 기능개발복_Solution{

    List<Integer> list = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();

    public int[] solution(int[] progresses, int[] speeds) {


        for (int i = 0; i < progresses.length ; i++) {
            //list.add((int) Math.ceil((double)(100 - progresses[i]) / speeds[i]));
            queue.offer((int) Math.ceil((double)(100 - progresses[i]) / speeds[i]));

        }
        int start = queue.poll();
        int cnt = 1;

        for (int i = 1; i <progresses.length ; i++) {
            int next = queue.poll();
            if( next <= start){
                cnt++;
            }
            else {
                list.add(cnt);
                cnt = 1;
                start = next;
            }
        }
        list.add(cnt);

        int[] answer =list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
