package LEVEL1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K번째수복습 {
    public static void main(String[] args) {
        K번째수복습_Solution sl = new K번째수복습_Solution();
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(sl.solution2(array,commands));

    }
}
class K번째수복습_Solution{
    int[] array;
    int[][] commands;



    public int[] solution(int[] array, int[][] commands) {
        this.array = array;
        this.commands = commands;
        int[] answer  = new int[commands.length];

        for (int i = 0; i <commands.length ; i++) {
            int[] d = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(d);
            answer[i] = d[commands[i][2]-1];

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int[] solution2(int[] array, int[][] commands) {
        this.array = array;
        this.commands = commands;
        int[] answer  = new int[commands.length];

        for (int i = 0; i < commands.length ; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int index = commands[i][2];

            int[] arr = new int[end-start];
            for (int j = 0; j <arr.length ; j++) {
                arr[j] = array[start+j];
            }
            Arrays.sort(arr);
            answer[i] =arr[index];


        }


        return answer;
    }

}
