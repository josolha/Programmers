package 별찍기;

import 백준.P1926_그림;
import 백준.P2607_비슷한단어;

public class stars {
    public static void main(String[] args) {

        System.out.println("====2차원 배열====");
        int line = 3;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <line+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("================");


        System.out.println("====왼쪽 삼각형====");
        line = 4;

        for (int i = 1; i <= line ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = line; i >=1 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("================");


        System.out.println("====오른쪽 삼각형====");
        line = 4;
        for (int i = 0; i <line; i++) {
            for (int j = line-1; j >=0 ; j--) {
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = line; i > 0 ; i--) {
            for (int j = line; j >0 ; j--) {
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("=================");


        System.out.println("====피라미드 삼각형====");
        line = 5;
        line =(line-1)/2;  // 1->3 , 2-> 5, 3->7
        for (int i = 0; i <line; i++) {
            for (int j = 0; j <line-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = line; i >=0 ; i--) {
            for (int j = 0; j <line-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println("=================");

        System.out.println("====다이아몬드 삼각형====");


        System.out.println("=================");
    }
}
