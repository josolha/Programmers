package 해쉬;

import java.util.Arrays;
import java.util.HashMap;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        전화번호목록Solution2 sol = new 전화번호목록Solution2();
        System.out.println(sol.solution(phone_book));
    }
}

class 전화번호목록Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        //1.sort
        Arrays.sort(phone_book);

        //2.1중 loop 돌면서 앞번호가 뒷번호의 접두어인지 확인한다
        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;
        }
        return true;

        //3.여기까지 없다면 접두어 없다는것

    }
}

class 전화번호목록Solution2 {

    //hashMap으로 풀기
    public boolean solution(String[] phone_book) {

        boolean answer = true;
        //1.hashMap을 만든다
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            hashMap.put(phone_book[i],1);
        }
        System.out.println(hashMap);

        //2.모든 전화번호의 접두어가 hashMap에 있는지 확인한다.
        for (int i = 0; i < phone_book.length ; i++) {
            for (int j = 0; j < phone_book[i].length() ; j++) {
                if(hashMap.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        //3.여기까지 왔다면 접두어가 없다는 것이다.
        return true;
    }
}
