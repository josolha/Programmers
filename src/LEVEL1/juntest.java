package LEVEL1;

import java.util.Arrays;

public class juntest {
    public int[] solution(int n) {
        int[] answer = new int[n];
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i]= String.valueOf(i+1);
        }
        Arrays.sort(arr);

        for (int i = 0; i <arr.length ; i++) {
            answer[i]=Integer.parseInt(arr[i]);
        }

        return answer;
    }

}
