package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class P13305_주유소 {
    static long[] distance;
    static long[] pricePoint;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();

        distance = new long[steps-1];
        pricePoint = new long[steps];

        for (int i = 0; i < steps-1; i++) {
            distance[i]= sc.nextInt();
        }
        for (int i = 0; i < steps; i++) {
            pricePoint[i] = sc.nextInt();
        }

//        System.out.println("steps = " + steps);
//        System.out.println("distance = " + Arrays.toString(distance));
//        System.out.println("price = " + Arrays.toString(pricePoint));

        Long totalPrice = 0L;

        Long min = pricePoint[0];

        for (int i = 0; i < steps-1 ; i++) {

           if(pricePoint[i] < min){
                //totalPrice += pricePoint[i] * distance[i];
                min = pricePoint[i];
            }
            totalPrice += min * distance[i];
        }

        System.out.println(totalPrice);

    }
}
