package 스택큐;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
    boolean answer = true;

    char[] array = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {


            /*
                1. ( 일때 스택에 넣는다

                2. ) 일때 이미 스택에 ( 가 있으면 삭제 아니면 스택에 넣는다

                3. 스택이 비어있으면 true 아니면 false.
             */

            if(array[i] =='('){
                stack.push(array[i]);
            } else if (stack.size() != 0 && stack.peek() =='(') {
                stack.pop();
            } else{
                stack.push(array[i]);
            }
        }
        return answer = (stack.isEmpty()) ? true : false;
    }
    public static void main(String[] args) {
        String s = "())";
        올바른괄호 올바른괄호 = new 올바른괄호();
        올바른괄호.solution(s);
    }
}
