package 해쉬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 전화번호목록복습 {
    public static void main(String[] args) {

        String[] phone_book = {"123", "456", "789"};
        전화번호목록복습_Solution sl = new 전화번호목록복습_Solution();
        System.out.println(sl.solution(phone_book));
    }

}
class 전화번호목록복습_Solution{

    int[] phone_book;
    boolean answer;

    public boolean solution(String[] phone_book){
        Arrays.sort(phone_book);
        for (int i = 0; i <phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                return answer = false;
            }
        }
        return answer =true;
    }
    Map<String,Integer> map = new HashMap<>();
    public boolean solution2(String[] phone_book){
        for (int i = 0; i < phone_book.length ; i++) {
            map.put(phone_book[i],i);
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j <phone_book[i].length() ; j++) {
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }
}


