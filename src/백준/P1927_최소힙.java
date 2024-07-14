package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class P1927_최소힙 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  a= Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i <a ; i++) {
            int b= Integer.parseInt(br.readLine());
            if(b==0){
                if(heap.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(heap.poll());
                }
            }else{
                heap.add(b);
            }
        }
    }
}
