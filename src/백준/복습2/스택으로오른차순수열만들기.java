package 백준.복습2;

import java.util.Scanner;
import java.util.Stack;

public class 스택으로오른차순수열만들기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int A[] = new int[N];

        for (int i = 0; i <N ; i++) {
            A[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();

        int number = 1;

        for (int i = 0; i < A.length; i++) {
            while (number <= A[i]) {
                stack.push(number++);
                bf.append("+\n");
            }

            if(!stack.empty() && stack.peek() == A[i]){
                stack.pop();
                bf.append("-\n");
            } else {
                System.out.println("NO");
                return;  // or you can use System.exit(0); to terminate the program
            }
        }
        // Print the sequence of operations if possible.
        System.out.print(bf.toString());


    }
}
