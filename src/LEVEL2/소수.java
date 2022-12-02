package LEVEL2;

import com.sun.scenario.effect.impl.state.AccessHelper;

public class 소수 {
    public static void main(String[] args) {

        int n = 19;

        if(소수.checkprime(n)==1){
            System.out.println("소수입니다");
        }else{
            System.out.println("소수가아닙니다");
        }


    }

    public static int checkprime(int n) {
        for (int i = 2; i <=(int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}