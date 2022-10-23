package LEVEL1;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class 제일작은수제거하기 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12935
    public int[] solution(int[] arr) {

        if(arr.length==1){
            int[] answer = {-1};
            System.out.println(Arrays.toString(answer));
            return answer;
        }

        int[] answer = new int[arr.length - 1];

        int min = arr[0];

        int index = 0;


        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {

        제일작은수제거하기 sl = new 제일작은수제거하기();
        int[] arr = {4,3,2,1};
        int[] arr2 = {2};
        sl.solution(arr);

        int min = arr[0];

        int index = 0;

        int[] answer = new int[arr.length - 1];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {  // arr[0] == min 같으면 넘어감
                continue;
            }
            answer[index++] = arr[i]; //answer[0] =  arr[0]
                                      //
        }
    }
}

