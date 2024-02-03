package softeer;

import java.util.Arrays;
import java.util.Scanner;

public class 효도음식 {

    static int[] arr;
    static int a;

    static boolean[] visited;

    static int[] combination;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        arr = new int[a];
        visited = new boolean[a];
        combination = new int[a];


        for (int i = 0; i <a ; i++) {
            arr[i] = scanner.nextInt();
        }

        dfsCombination(0);

    }
    private static void dfsCombination(int index) {
        if (index == a){
            System.out.println(Arrays.toString(combination)); // 배열 출력
            return;
        }
        for (int i = 0; i <a; i++) {
            if(!visited[i]){
                visited[i] = true;
                combination[index] = arr[i];
                dfsCombination( index + 1); // 여기서 dfs 호출 결과를 total에 누적
                visited[i] = false;
            }
        }
    }
}
