package 백준.복습;

import java.util.Scanner;
import java.util.Stack;

public class 스택으로오름차순수열만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLength = scanner.nextInt();

        int[] numberArr = new int[numberLength];

        for (int i = 0; i <numberArr.length ; i++) {
            numberArr[i] = scanner.nextInt();
        }

        int numberCnt = 0;
        Stack<Integer> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        boolean result = true;

        for (int i = 0; i < numberArr.length ; i++) {

            int temp = numberArr[i];

            if (temp >= numberCnt) {
                while (temp >= numberCnt) {
                    stack.push(numberCnt++);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            }else{
                int pop = stack.pop();
                if(pop != temp){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                stringBuffer.append("-\n");
            }
        }
        if(result){
            System.out.println(stringBuffer.toString());
        }


    }
}
