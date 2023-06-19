package 백준;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택으로오름차순수열만들기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int A[] = new int[N];

        for (int i = 0; i <N ; i++) {
            A[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        int num = 1;

        for (int i = 0; i <A.length ; i++) {
            int su = A[i];

            if(su >= num){
                while(su>=num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());



    }
}
