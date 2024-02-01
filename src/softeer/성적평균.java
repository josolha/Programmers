package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 성적평균 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());

        int b = Integer.parseInt(stringTokenizer.nextToken());

        int[] scores = new int[a];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < a ; i++) {
            scores[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < b ; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int from = Integer.parseInt(stringTokenizer.nextToken());
            int sum = 0;
            for (int j = start-1; j < from; j++) {
                sum += scores[j];
            }
            double average = (double) sum / (from -start +1);
            String formattedAverage = String.format("%.2f", average);
            System.out.println(formattedAverage);
        }
    }
}
