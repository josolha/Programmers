package LEVEL1;

import java.util.*;

public class 문자열내맘대로정렬하기 {
    public String[] solution(String[] strings, int n) {

//        String[] answer = {};
//
//        ArrayList<String> arr = new ArrayList<>();
//
//        for (int i = 0; i < strings.length; i++) {
//            arr.add(""+strings[i].charAt(n)+strings[i]);
//        }
//        Collections.sort(arr);
//        System.out.println(arr);
//
//        answer = new String[arr.size()];
//
//        for (int i = 0; i < arr.size(); i++) {
//            answer[i] = arr.get(i).substring(1,arr.get(i).length());
//        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)> o2.charAt(n)){
                    return 1;
                }else if(o1.charAt(n)==o2.charAt(n)) {
                    return o1.compareTo(o2);
                }else if(o1.charAt(n)<o2.charAt(n)){
                    return -1;
                }else return 0;
            }

        });
        System.out.println(Arrays.toString(strings));
        return strings;
    }

    public static void main(String[] args) {
        문자열내맘대로정렬하기 sl = new 문자열내맘대로정렬하기();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        sl.solution(strings,1);


    }

}
