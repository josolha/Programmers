package 완전탐색;

import java.util.HashSet;
import java.util.Iterator;

public class 소수찾기_재귀함수 {
//https://school.programmers.co.kr/learn/courses/30/lessons/42839
    HashSet<Integer> numberSet = new HashSet<>();
    public boolean isPrime(int num){
        // 1.0과 1은 소수가 아니다.
        if(num ==0 || num == 1)
            return false;
        // 2.에라토스테네스의 체의 limit을 계산한다.
        int lim = (int)Math.sqrt(num);

        // 3.에라토스테네스의 체에 따라 limit까지만 배수 여부를 확인한다.
        // ("소수가 되는 수의 배수를 지우면 남은 건 소수가 된다") -  특정 범위 내의 모든 소수를 찾으려면 효과적
        for (int i = 2; i <lim ; i++) {
            if(num %i ==0){
                return false;
            }

        }
        return true;
    }
    public void recursive(String comb,String others ){
        //comb 조합된 숫자 , others 사용하지 않은 숫자

        //1. 현재 조합을 set에 추가한다.
        if(!comb.equals(""))
            numberSet.add(Integer.valueOf(comb)); // paserint도 사용가능 한가?

        //2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for (int i = 0; i <others.length() ; i++) { // length => 0,1,2
            recursive(comb+ others.charAt(i),others.substring(0,i)+others.substring(i+1)); // substring 으로 합친수 빼고 다음수
        }

    }

    public int solution(String numbers){
        int count = 0;

        // 1.모든 조합의 숫자를 만든다.

        recursive("", numbers);

        System.out.println(numberSet);

        //2. 소수의 개수를 센다.
        Iterator<Integer> it = numberSet.iterator(); // hasnext, next, remove

        while(it.hasNext()){
            int number = it.next();
            if(isPrime(number))
                count++;
        }
        //3. 소수의 개수를 반환한다.
        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {
        소수찾기_재귀함수 sl = new 소수찾기_재귀함수();
        sl.solution("177");

//        String a ="abcdef";
//        System.out.println(a.substring(1));




    }
}

//public class 에라토스테네스체 {
//
//
//    public boolean[] primeNumber(boolean[] primeNumbers,int n) {
//
//        primeNumbers[0] = primeNumbers[1] =false;
//
//        for (int i = 2; i < Math.sqrt(n); i++) {
//            if(!primeNumbers[i]){
//                for (int j = i*i; j <= n; j+=i) {
//                    primeNumbers[j] =true;
//                }
//            }
//        }
//        return primeNumbers;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("hello");
//        에라토스테네스체 cnt = new 에라토스테네스체();
//
//        int n = 122;
//
//        boolean[] primeNumbers = new boolean[n+1];
//
//        primeNumbers = cnt.primeNumber(primeNumbers,n);
//
//        for (int i = 1; i <= n ; i++) {
//            if(!primeNumbers[i]){
//                System.out.println(i);
//            }
//        }
//
//
//
//
//    }
//}
