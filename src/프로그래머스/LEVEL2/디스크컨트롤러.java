package 프로그래머스.LEVEL2;

import java.util.PriorityQueue;

public class 디스크컨트롤러 {
    public static void main(String[] args) {
        int[][] job = {{0, 3}, {1, 9}, {2, 6}};

        디스크컨트롤러_Solution sl = new 디스크컨트롤러_Solution();
        System.out.println(sl.solution(job));


    }
}
class 디스크컨트롤러_Solution{

    int[][] jobs;

    PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

    public int solution(int[][] jobs) {
        this.jobs = jobs;
        int answer = 0;

        for (int i = 0; i < jobs.length ; i++) {
            queue.offer(jobs[i]);
            System.out.println(jobs[i]);
        }

        int wait = 0;
        int time = 0;
        int total = 0;

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            wait += current[0];
            time += current[1];
        }


        return (time-wait) / jobs.length;
    }
}
