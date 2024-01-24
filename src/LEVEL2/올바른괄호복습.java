package LEVEL2;

import java.util.Stack;

public class 올바른괄호복습 {
    public static void main(String[] args) {
        String s  = ")()(";
        올바른괄호복습_Solution sl = new 올바른괄호복습_Solution();
        System.out.println(sl.solution(s));

    }
}
class 올바른괄호복습_Solution {

    Stack<Character> stack = new Stack<>();
    String s;

    boolean solution(String s) {
        this.s = s;

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else {
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}
