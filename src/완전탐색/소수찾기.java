package 완전탐색;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 소수찾기 {

    public static void main(String[] args) {
        소수찾기_Solution sl = new 소수찾기_Solution();
        
        String number = "17";
        System.out.println(sl.solution(number));
        System.out.println(sl.isPrime(19));
    }
}


class 소수찾기_Solution {

    Set<Integer> hashSet= new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;

        recursive("",numbers);

        Iterator<Integer> set = hashSet.iterator();

        while (set.hasNext()){
            int number = set.next();
            if(isPrime(number)){
                answer++;
            }
        }
        return answer;
    }
    public void recursive(String comb, String number){
        if(!comb.equals("")){
            hashSet.add(Integer.parseInt(comb));
        }
        for (int i = 0; i <number.length() ; i++) {
            recursive(comb+number.charAt(i),number.substring(0,i)+number.substring(i+1));
        }
    }
    public boolean isPrime(int number){
        if(number <= 2){
            return false;
        }

        for (int i = 2; i <= (int)Math.sqrt(number); i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}