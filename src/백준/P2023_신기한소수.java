package 백준;


import java.util.Scanner;
public class P2023_신기한소수 {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        getResult(0,number);

        System.out.println(sb.toString());


    }
    private static void getResult(int output, int n) {
        if (n == 0) {
            sb.append(output).append("\n");
            return;
        }
        for (int i=0; i<10; i++) {
            int next = output*10+i;
            if (isPrime(next)) getResult(next, n-1);
        }
    }

    private static boolean isPrime(int num){
        if(num < 2 ){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num)  ; i++) {
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
