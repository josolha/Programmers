package 완전탐색;

import java.util.ArrayList;
import java.util.HashSet;

public class 연습 {

    HashSet<Integer> Hs = new HashSet<>();
    public void recursive(String comb, String others){

        if(!comb.equals("")) {
            Hs.add(Integer.valueOf(comb));
        }
        for (int i = 0; i < others.length() ; i++) {
            recursive(comb+others.charAt(i),others.substring(0,i)+others.substring(i+1));
        }

    }
    ArrayList<Integer> al = new ArrayList<>();

    public void recursive2(String comb, String others){

        if(!comb.equals("")) {
            al.add(Integer.valueOf(comb));
        }
        for (int i = 0; i < others.length() ; i++) {
            recursive2(comb+others.charAt(i),others.substring(0,i)+others.substring(i+1));
        }

    }

    public static void main(String[] args) {

        연습 pr = new 연습();
        String numbers = "177";

        pr.recursive("",numbers);
        pr.recursive2("",numbers);

        System.out.println(pr.Hs);
        System.out.println(pr.al);
        
        int[] arr = {1,2,3,4,5};

//        for (int i = 0; i < ; i++) {
//
//        }
    }
}
