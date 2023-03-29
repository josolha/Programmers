package 스택큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};

        int[] speeds = {1,30,5};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};


        기능개발 기능개발 = new 기능개발();
        기능개발.solution(progresses,speeds);

    }

    public int[] solution(int[] progresses, int[] speeds) {


//        progresses = {93,30,55};
//        speeds = {1,30,5};

        //1. 남은 일수 계산하기
        //ex. 7일,3일,9일
        ArrayList<Integer> list =new ArrayList<>();

        for (int i = 0; i <progresses.length ; i++) {
                list.add((int) Math.ceil((double)(100 -progresses[i])/speeds[i]));
        }
        System.out.println(list);

        //2. 리턴 일수 구하기
        // 스택에 7일을 넣는다 다음 숫자가 7보다 작으면 버림 크면 넣음
        // 버릴떄 카운트 추가 하고 배열에 추가
        ArrayList<Integer> result =new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <list.size() ; i++) {
            int check = 1;
            if(stack.size() != 0 && stack.peek() >= list.get(i)) {
                result.set(result.size()-1, result.get(result.size() - 1)+1);
            }
            else{
                stack.push(list.get(i));
                result.add(check);
            }
        }
        System.out.println(result);
        int[] answer = result.stream().mapToInt(i->i).toArray();;

        return answer;
    }
}
