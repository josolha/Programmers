package 백준;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class P2512_예산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        int[] list = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int num = sc.nextInt();
            list[i] = num;
        }
        Arrays.sort(list);

        long line = sc.nextInt();

        int max = list[cnt-1];

        int min = 0;
        int middle = 0;

        while (min <= max){
            long total = 0;
            middle = (min + max) /2;
            for (int i = 0; i < list.length ; i++) {
                if(list[i] <= middle){
                    total += list[i];
                }else{
                    total += middle;
                }
            }
            if(total <= line){
                min = middle +1;
            }else{
                max = middle -1;
            }

        }
        System.out.println(max);



    }
}
