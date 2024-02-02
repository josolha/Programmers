package 프로그래머스.LEVEL1;


public class 소수찾기 {
    public int solution(int n) {


//        int answer = 0;
//        int cnt = 0;
//
//        for (int i = 1; i <= n; i++) { // 2 ~ 10
//            for (int j = 1; j <= i; j++) { // 2일때 1,2, 3일때 1,2,3
//                if (i % j == 0) {
//                    cnt++;
//                }
//            }
//            if (cnt == 2) {
//                answer++;
//            }
//            cnt = 0;
//        }
//        System.out.println(answer);
//        return answer;
//    }

        int answer =0;
        for (int i = 2; i <= n ; i++) {
            boolean flag = true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag ==true){
                answer++;
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        소수찾기 sl = new 소수찾기();
        sl.solution(5);

        int  a = 5;

    }
}
