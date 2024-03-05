package 백준;

import java.util.Scanner;

public class P2292_벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();

        System.out.println(a);

        int mutiMax = 1;
        int layer = 1;
        int c  =1;

        while(a>mutiMax){
            mutiMax += (6*c);
            c++;
            layer++;
        }

        System.out.println(layer);
    }
}
