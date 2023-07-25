package 백준;

import java.util.Scanner;

public class P2609_최대공약수와최소공배수 {
    /*
       유클리드 호제법 : 두수의 최대 공약수를 구하는 알고리즘

       수행하려면 MOD 연산을 이해하고 있어야한다.
       (MOD =  최대 공약수를 구하는데 사용하는 핵심 연산이고
        두 값을 나눈 나머지를 구하는 연산)

        단계:

        1. 큰 수를 작은 수로 나누는 MOD 연산 수행한다.
        2. 앞 단계에서의 작은 수와 MOD 연산 결과값(나머지)으로 MOD 연산을 수행한다.
        3. 2단계를 반복하다가 나머지가 0이 되는 순간의 작은 수를 최대 공약수로 선택한다.

        예) gcd(270 ,192)

            270 % 192 = 78
                  192 % 78 = 36
                        78 % 36 =6
                             36 % 6 = 0
            gcd(270,192) = 6

           추가적으로 여기에서 아래단계를 넘어가는 거를 재귀함수로 쉽게 구현가능하다.


        GCD :최대공약수는 두 수가 공통적으로 가지고 있는 약수 중 가장 큰 수입니다.
        LCM : 최소공배수는 두 수가 공통적으로 가지는 배수 중 가장 작은 수입니다.

        두 수를 곱하면, 그 결과에는 각 수의 모든 소인수가 포함되게 됩니다. 이 때, 두 수의 소인수 중 겹치는 부분이 존재한다면, 이는 곧 두 수의 최대공약수를 구성하는 소인수들입니다. 따라서 두 수를 곱한 결과에서 최대공약수를 나누게 되면, 겹치는 소인수들을 제거하게 되고 이는 곧 두 수의 최소공배수를 얻게 됩니다.

        예를 들어, 두 수 12와 15를 생각해 보겠습니다.

        12의 소인수: 2, 2, 3
        15의 소인수: 3, 5
        12과 15의 최대공약수: 3
        12과 15의 최소공배수: 2, 2, 3, 5
        12와 15를 곱하면 180이고, 이를 최대공약수인 3으로 나누면 60이 나옵니다.
        60은 두 수 12와 15의 최소공배수입니다.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_number = sc.nextInt();
        int second_number = sc.nextInt();

        int a = gcd(first_number,second_number);
        System.out.println("gcd = " + a);

        int b = lcm(first_number,second_number,a);
        System.out.println("lcd = " + b);


    }

    private static int lcm(int first_number, int second_number, int a) {
        return (first_number*second_number)/a;
    }

    //gcd (24,18)
    //gcd (18,6)
    //

    private static int gcd(int first_number, int second_number) {
        if (second_number ==0){
            return first_number;
        }else{
            return gcd(second_number,first_number%second_number);
        }
    }
        /*
                270 % 192
                      192 % 78
                            78 % 36
                                 36 % 6
                                      6 % 0
       */

}
