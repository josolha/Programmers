package 백준;

import java.util.Scanner;

public class P9655_돌게임 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a =sc.nextInt();

        if(a%2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
