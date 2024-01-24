package 스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스복습 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0 ;

        프로세스_Solution복습 sl = new 프로세스_Solution복습();

        System.out.println(sl.solution(priorities, location));
    }
}
class 프로세스_Solution복습 {
    Queue<int[]> queue = new LinkedList<>();

    public int solution(int[] priorities, int location) {
        int answer =0;

        for (int i = 0; i <priorities.length ; i++) {
            queue.offer(new int[]{priorities[i],i});
        }
        while (!queue.isEmpty()){

            //1. 뺸값을 제일 큰수 인지 확인하고 아니면 다시 넣는다.
            int[] current = queue.poll();
            boolean isHighest = true;
            for (int[] p  : queue) {
                if(current[0] < p[0]){
                    isHighest =false;
                    break;
                }
            }
            if(!isHighest){
                queue.offer(current);

            //2.아닐경우에 answer 를 +1 하고 위치랑 같은면 리턴한다.
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
