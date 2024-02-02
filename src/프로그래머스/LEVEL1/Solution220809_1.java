package 프로그래머스.LEVEL1;

public class Solution220809_1 {


    class solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int max_row = 0;
            int max_col = 0;

            for (int i = 0; i < sizes.length; i++) {
                if(sizes[i][0] < sizes[i][1]){
                    int store = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = store;

                    System.out.println(store);
                }
                if(max_row<sizes[i][0]) max_row = sizes[i][0];
                if(max_col<sizes[i][1]) max_col = sizes[i][1];

            }
            return max_col*max_row;

            }
        }

        public static void main(String[] args) {
            int[][] number = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

            Solution220809_1 sl = new Solution220809_1();
            Solution220809_1.solution sl2 = sl.new solution();
            sl2.solution(number);


        }
    }
