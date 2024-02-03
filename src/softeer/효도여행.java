package softeer;

import java.util.*;

public class 효도여행 {
    static int N, M;
    static String S;
    static ArrayList<Edge>[] tree;
    static int maxHappiness = 0;

    static class Edge {
        int node;
        char roadType;

        Edge(int node, char roadType) {
            this.node = node;
            this.roadType = roadType;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        S = sc.next();

        tree = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            char c = sc.next().charAt(0);
            tree[u].add(new Edge(v, c));
            tree[v].add(new Edge(u, c));
        }

        findHappiness(1, -1, "");

        System.out.println(maxHappiness);
    }

    static void findHappiness(int node, int parent, String path) {
        if (tree[node].size() == 1 && node != 1) {
            maxHappiness = Math.max(maxHappiness, calculateLCS(S, path));
            return;
        }

        for (Edge edge : tree[node]) {
            if (edge.node != parent) {
                findHappiness(edge.node, node, path + edge.roadType);
            }
        }
    }

    static int calculateLCS(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[a.length()][b.length()];
    }
}

