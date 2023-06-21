package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286_절대값힙구현하기 {

    /*

    우선순위 큐

        절댓값과 관련된 정렬이 필요

        슈도코드 :
            우선순위 큐 선언
                - 절댓값 기준으로 정렬되도록 설정
                - 단, 절댓값이 같으면 음수 우선 정렬
            for(N만큼 반복)
            {
               요청이 0일때 : 큐가 비어 있으면 0 , 비어 있지 않으면 큐의 front 값 출력 - poll()
               요청이 1일때 : 새로운 데이터를 우선순위 큐에 더하기 - add()

            }

     */

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2) ->{

                int first_abs = Math.abs(o1);
                int second_abs = Math.abs(o2);

                if(first_abs == second_abs){  //1.절댓값 같은 경우 음수 우선
                    return o1 > o2 ? 1 : -1; //똑같음 == return Integer.compare(o1, o2);

                    // 1 , 1
                    //-1 ,-1
                    // 1 ,-1
                    //-1 , 1
                }
                return first_abs - second_abs; //2.절댓값 작은 데이터 우선
        });

        for (int i = 0; i < N ; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());
            if(request ==0){
                if(myQueue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(myQueue.poll());
                }
            }else{
                myQueue.add(request);
            }
        }







    }
}
