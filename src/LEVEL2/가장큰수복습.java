package LEVEL2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수복습 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        가장큰수복습_Solution sl = new 가장큰수복습_Solution();
        System.out.println(sl.solution(numbers));


    }
}
class 가장큰수복습_Solution{
    int[] numbers;
    String[] str;

    String answer ="";

    public String solution(int[] numbers) {

        this.numbers = numbers;
        this.str = new String[numbers.length];

        for(int i = 0 ; i<numbers.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }


        Arrays.sort(str,(o1, o2) -> (o2+o1).compareTo(o1+o2));
        for (String answer: str) {
            this.answer += answer;
        }
        if(str[0].equals("0")) answer = "0";

        return answer;
    }

}
