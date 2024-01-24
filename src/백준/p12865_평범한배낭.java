package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p12865_평범한배낭 {

    static List<Integer>lists[];

    static int K;
    static int N;

    static int maxValue;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(st.nextToken());
        lists = new ArrayList[N];
        K = Integer.parseInt(st.nextToken());

        for (int i = 0; i <N ; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < N ; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int W = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            lists[i].add(W);
            lists[i].add(V);

        }
        System.out.println(recursive(0,0,0));
    }

    private static int recursive(int index, int totalWeight, int totalValue) {
        if (index == N || totalWeight > K) {
            return totalValue;
        }
        maxValue = totalValue;
        if (totalWeight + lists[index].get(0) <= K) { // 무게 확인
            maxValue = Math.max(maxValue, recursive(index + 1, totalWeight + lists[index].get(0), totalValue + lists[index].get(1)));
        }
        maxValue = Math.max(maxValue, recursive(index + 1, totalWeight, totalValue));
        return maxValue;
    }
}
