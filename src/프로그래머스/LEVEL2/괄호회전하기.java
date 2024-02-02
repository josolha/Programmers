package 프로그래머스.LEVEL2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 괄호회전하기 {

    public int solution(String s) {

        List<Character> list = new ArrayList<>();
        char[] chArr = s.toCharArray();

        int rotate = s.length();
        int answer = 0;

        for (int i = 0; i < chArr.length; i++) {
            list.add(chArr[i]);
        }

        while (rotate > 0) {

            System.out.println(list);

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < list.size(); i++) {

//                ==================================== first try
//                if(list.get(i) == '('|| list.get(i) == '['||list.get(i) == '{'){
//                       st.push(list.get(i));
//
//                }else if(!st.isEmpty() && (list.get(i) == ')'|| list.get(i) == ']'||list.get(i) == '}')){
//                        st.pop();
//                }
//                ==================================== Second try

//                if(list.get(i) =='('){
//                    st.push(list.get(i));
//                }else if(!st.isEmpty() && st.peek()=='('&&(list.get(i) ==')')){
//                    st.pop();
//                }
//                if(list.get(i) =='['){
//                    st.push(list.get(i));
//                }else if(!st.isEmpty() &&st.peek()=='['&& (list.get(i) ==']')){
//                    st.pop();
//                }
//                if(list.get(i) =='{'){
//                    st.push(list.get(i));
//                }else if(!st.isEmpty() && st.peek()=='{'&&(list.get(i) =='}')){
//                    st.pop();
//                }
//                }
//                ==================================== third try
                if (st.isEmpty()) {
                    st.push(list.get(i));
                } else if (st.peek() == '[' && list.get(i) == ']') {
                    st.pop();
                } else if (st.peek() == '(' && list.get(i) == ')') {
                    st.pop();
                } else if (st.peek() == '{' && list.get(i) == '}') {
                    st.pop();
                } else {
                    st.push(list.get(i));
                }
            }

            if (st.isEmpty()) {
                answer++;
            }
            Collections.rotate(list, 1);
            rotate -= 1;
        }
        System.out.println(answer);
        return answer;

    }


    public static void main(String[] args) {
        괄호회전하기 괄호회전하기 = new 괄호회전하기();

        String s = "[](){}";
        String s1 = "}]()[{";
        String s2 = "[)(]";
        String s3 = "}}}";

        괄호회전하기.solution(s);
    }

}
