package LEVEL1;


import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {

//         오류 발생 -> 효율성 떨어짐.
//        Stack<Integer> st = new Stack<>();
//        st.push(-1);
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            if(st.peek() == arr[i]) {
//                continue;
//            }else{
//                st.push(arr[i]);
//            }
//        }
//        System.out.println(st);
//
//        int[] answer = new int[st.toArray().length-1];
//
//        for (int i = 1; i <st.toArray().length ; i++) {
//            answer[i-1] = st.get(i);
//            //  answer = 4개
//            //  1,2,3,4
//            // 0 -> 1  , 1 -> 3, 2 ->0, 3-> 1
//        }
//        System.out.println(Arrays.toString(answer));
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        //
        int value = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != value) {
                answerList.add(arr[i]);
                value = arr[i];
            }
        }

        return answerList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        같은숫자는싫어 sl = new 같은숫자는싫어();
        int[] arr = {4,4,4,3,3};
        sl.solution(arr);
    }

}
