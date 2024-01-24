package 스택큐;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import sun.util.resources.cldr.nus.CalendarData_nus_SD;

public class 같은숫자는싫어복습 {
    public static void main(String[] args) {
        같은숫자는싫어복습_Solution sl = new 같은숫자는싫어복습_Solution();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(sl.solution(arr));
    }

//map은 데이터 변형
    //int 에서 String 은 mapToObj 사용
    //기본형 스트림은 특정 타입의 기본값(예: int, long, double)만을 처리할수 있다.
    //중간 연산: map, filter, sorted 등과 같은 중간 연산은 스트림의 각 요소에 대해 특정 작업을 수행하고,
    // 그 결과로 새로운 스트림을 반환합니다. 이 연산들은 연결될 수 있어 여러 단계의 처리를 파이프라인으로 구성할 수 있습니다.

    //map 연산은 스트림의 각 요소에 함수를 적용하여 그 결과로 새로운 스트림을 생성합니다. 주로 요소의 변환 또는 매핑에 사용됩니다. 예를 들어, 객체의 특정 필드를 추출하거나 요소의 타입을 변환할 때 사용합니다.
    //최종 연산: collect, forEach, reduce, sum 등의 최종 연산은 스트림 처리를 완료하고 결과를 반환합니다.
    // 최종 연산을 수행한 후에는 스트림을 더 이상 사용할 수 없습니다.
}
class 같은숫자는싫어복습_Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = {};

        Arrays.stream(arr)
                        .mapToObj(Integer::toString)
                                .forEach(System.out::println);

        Arrays.stream(arr)
                .boxed()
                .sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).forEach(System.out::println);

        Arrays.stream(arr).forEach(A -> {
            if(!stack.isEmpty() && stack.peek() == A){
                stack.pop();
            }
            stack.push(A);
        });

        answer = stack.stream().mapToInt(i -> i).toArray();

        //Arrays.stream(arr).forEach(stack::push);

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
