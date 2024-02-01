package 완전탐색;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 소수찾기 {

    public static void main(String[] args) {
        소수찾기_Solution sl = new 소수찾기_Solution();
        
        String number = "17";
        System.out.println(sl.solution(number));
    }
}


class 소수찾기_Solution {
    int answer = 0;

    Set<Integer> hashset = new HashSet<>();

    public int solution(String numbers) {

        recursive("",numbers);

        Iterator<Integer> set = hashset.iterator();


        while(set.hasNext()){
            int number = set.next();
           if(isPrime(number)){
               answer++;
           }
        }

        return answer;

    }

    private void recursive(String s, String numbers) {
        if(!s.equals("")){
            hashset.add(Integer.parseInt(s));
        }
        for (int i = 0; i < numbers.length() ; i++) {
            recursive(s+numbers.charAt(i),numbers.substring(0,i)+numbers.substring(i+1));
        }
    }

    public boolean isPrime(int i) {
        if(i <= 1){
            return false;
        }
        for (int j = 2; j <= (int)Math.sqrt(i); j++) {
            if(i%j ==0){
                return false;
            }
        }

        return true;
    }
}