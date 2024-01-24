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
        System.out.println(다리를지나는트럭.solution(bridge_length,weight,truck_weights));

    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int totalWeightOnBridge = 0;
        int truckIndex = 0;

        // 다리의 길이만큼 0으로 초기화
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) {
            time++;
            totalWeightOnBridge -= bridge.poll(); // 다리에서 트럭이 빠져나가면 무게 감소

            if (truckIndex < truck_weights.length) {
                if (totalWeightOnBridge + truck_weights[truckIndex] <= weight) {
                    // 새 트럭이 다리에 올라갈 수 있는 경우
                    bridge.offer(truck_weights[truckIndex]);
                    totalWeightOnBridge += truck_weights[truckIndex];
                    truckIndex++;
                } else {
                    // 새 트럭이 다리에 올라갈 수 없는 경우
                    bridge.offer(0); // 다리의 무게를 유지하기 위해 0을 추가
                }
            }
        }

        return time;
    }
}
