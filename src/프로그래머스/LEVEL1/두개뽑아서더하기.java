package 프로그래머스.LEVEL1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {

    public Integer[] solution(int[] numbers) {

        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                 hs.add(numbers[i]+numbers[j]);
            }
        }
        Integer [] answer = hs.toArray(new Integer[hs.size()]);

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        두개뽑아서더하기 sl = new 두개뽑아서더하기();
//        int[] numbers = {2,1,3,4,1};
        int[] numbers = {5,0,2,7};
        sl.solution(numbers);
    }
}
