package swea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P1859_백만장자프로젝트 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i <T; i++) {
            int cnt = sc.nextInt();
            int[] list = new int[cnt];

            for (int j = 0; j <cnt; j++) {
                list[j] = sc.nextInt();
            }
            long profit = 0;
            int maxValue = list[cnt-1];

            System.out.println("maxValue = " + maxValue);

            for (int j = cnt-2; j >= 0; j--) {
                if(list[j]>maxValue){
                    maxValue = list[j];
                }else{
                    profit += (maxValue-list[j]);
                }

            }
            System.out.println("profit = " + profit);


        }
    }
    // 1 1 1
}
