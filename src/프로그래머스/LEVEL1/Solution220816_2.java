package 프로그래머스.LEVEL1;

public class Solution220816_2 {

    class Solution {

        public int solution(int num) {

            int answer = 0;

            while(num!=1) {

                if (num % 2 == 0) {
                    num = num/2;
//                    answer++;
                }else{
                    num = num * 3 + 1;
//                    answer++;
                }
                answer++;

//                if(answer==488){
//                    System.out.println(num);
//                }

                if(answer==500){
                    answer=-1;
                    break;
                }
            }

            System.out.println(answer);
            return answer;

        }
    }

    public static void main(String[] args) {
        System.out.println("hello");

        Solution220816_2 sl = new Solution220816_2();
        Solution220816_2.Solution sl2 = sl.new Solution();

        sl2.solution(626331);
    }
}
