package LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;

public class K번째수 {

        public int[] solution(int[] array, int[][] commands) {
            int[] answer = {};
            return answer;


        }


        public static void main(String[] args) {

            int[] a = {1, 5, 2, 6, 3, 7, 4};

            int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

            int[] answer = new int[b.length];

            K번째수 sl = new K번째수();
            sl.solution(a,b);

            for (int i = 0; i < b.length; i++) {
                int [] d = Arrays.copyOfRange(a,b[i][0]-1,b[i][1]);
                Arrays.sort(d);
                answer[i] = d[b[i][2]-1];
            }
            for (int x: answer) {
                System.out.print(x);
            }


//            for (int x[] : b) {
//                // 한줄씩
//                for (int i = 0; i < x.length; i++) {
//                    // i = 전체 길이 0 1,2, {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
//                    System.out.println(i);
//                    for (int j = x[0]-1; j < x[1]; j++) { // j = 1,2,3,4
//                        // j = b[0][0]-1  < b[0][1]   => 1 ~5  => 1,2,3,4
//                        c[i][k] = a[j];
//                        k++;
//                    }
//                }
//            }

//            Arrays.sort(c);

//            for (int z[]: c) {
//                System.out.print(z);
//            }
        }

}


