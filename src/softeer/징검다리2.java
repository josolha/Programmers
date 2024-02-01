package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 징검다리2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int length = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[length];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        ArrayList<Integer> lis = new ArrayList<>();

        for (int num : arr) {
            if (lis.isEmpty() || num > lis.get(lis.size() - 1)) {
                lis.add(num);
            } else {
                int index = Collections.binarySearch(lis, num);
                if (index < 0) {
                    index = -index - 1;
                }
                lis.set(index, num);
            }
        }

        System.out.println(lis.size());
    }
}
