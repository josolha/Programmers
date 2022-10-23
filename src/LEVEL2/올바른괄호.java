package LEVEL2;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = false;

        Stack<String> st = new Stack<>();

        for (int i = 0; i <s.length(); i++) {   //   "(()("
            if(s.charAt(i) == '(') {
                st.push(String.valueOf(s.charAt(i)));
            }else {
                if (st.isEmpty()) {             // (()(
                    return false;
                }
            st.pop();
            }
        }
        if(st.isEmpty()){
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        올바른괄호 sl = new 올바른괄호();
        String a = "(()(";
        sl.solution(a);
    }
}
//        "()()"	true
//        "(())()"	true
//        ")()("	false
//        "(()("	false
