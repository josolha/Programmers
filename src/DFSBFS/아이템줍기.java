package DFSBFS;

import java.util.Arrays;
import java.util.*;

public class 아이템줍기 {

    static char map[][]=new char[101][101];

    public static void main(String[] args) {
        int[][] rectangle = {{1, 1, 7, 4},{3,2,5,5}};

        int maxX = 0, maxY = 0;
        for (int[] rect : rectangle) {
            maxX = Math.max(maxX, rect[2]);
            maxY = Math.max(maxY, rect[3]);
        }

        // 방문 배열을 초기화합니다
        boolean[][] visited = new boolean[maxX + 1][maxY + 1];

        // 각 직사각형에 대해 방문 배열을 업데이트합니다
        for (int[] rect : rectangle) {
            for (int x = rect[0]; x <= rect[2]; x++) {
                for (int y = rect[1]; y <= rect[3]; y++) {
                    // 외곽선을 확인하여 해당 위치를 true로 설정
                    if (x == rect[0] || x == rect[2] || y == rect[1] || y == rect[3]) {
                        visited[x][y] = true;
                    }
                }
            }
        }

        for (int y = visited[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < visited.length; x++) {
                System.out.print(visited[x][y] ? "1 " : "0 ");
            }
            System.out.println();
        }

    }
    }
