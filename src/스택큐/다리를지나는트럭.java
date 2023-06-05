package 스택큐;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        다리를지나는트럭 다리를지나는트럭 = new 다리를지나는트럭();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(0%2);

        다리를지나는트럭.solution(bridge_length,weight,truck_weights);
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> bridge = new LinkedList<>();

        for (int i = 0; i < truck_weights.length ; i++) {
            bridge.add(truck_weights[i]);

            int sum = bridge.stream().mapToInt(Integer::valueOf).sum();



        }






        return answer;
    }


}
