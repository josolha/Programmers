package LEVEL1;

public class 짝수와홀수 {
    public String  solution(int num){

        String answer = "";

        if(num%2==0){
            answer = "Even";
        }else {
            answer = "Odd";

        }

//     %% num = -1  일때 결과값 짝수로 나와 오류 발생

//        if(num%2==1){
//            answer = "Odd";
//        }else {
//            answer = "Even";
//
//        }

        return answer;
    }
    public static void main(String[] args) {
        짝수와홀수 sl = new 짝수와홀수();

        int a = -1;
        System.out.println(sl.solution(a));


    }
}
