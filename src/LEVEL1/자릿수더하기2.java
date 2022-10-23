package LEVEL1;

public class 자릿수더하기2 {
    public int solution(int n){

        int answer = 0;

//        while(true){
//            answer += n%10;
//            if(n<10){
//                break;
//            }
//            n /= 10;
//        }
        while(n!=0){  // n = 0 이면 스톱
            answer += n%10; // 3 2 1
            n /= 10;  // 12 1 0
        }


        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기2 sl = new 자릿수더하기2();

        int a = 123;
        sl.solution(a);

        System.out.println(1/10);

    }
}
