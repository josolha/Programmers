package 프로그래머스.LEVEL1;

import java.util.Stack;

public class Solution220830_1 {

    public int solution(String s) {
        int answer = 0;
        int tem = 0;

        char[] arr = s.toCharArray();

        Stack<Character> st = new Stack<>();

        st.push('v');

        for (int i = 0; i < arr.length ; i++) {

            if (st.peek() == arr[i]) {
                st.push(arr[i]);
                tem ++;
                System.out.println(st.peek());

            }else{
                st.push(arr[i]);
                tem = 0;
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        Solution220830_1 sl = new Solution220830_1();
        String s = "aabbaccc";
        sl.solution(s);

    }
}
