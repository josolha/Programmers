package 백준;

import java.util.Scanner;

public class P1541_최솟값을만드는괄호 {

    /*
       빼는 - 가되는 숫자가 크면 클수록 전체 수식의 결과는 최소가 된다.

       1.-를 기준으로 스플릿
       2.그 안에서 +를 기준으로 스플릿
       3.각각 int 값으로 변환해서 리턴값에 더하기
       4.맨앞은 더해주고 리턴값들은 다 빼준다.

     */
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Line 긴줄을 받을때 사용
        String example = sc.nextLine();
        
        //스플릿하게 되면 배열로 반환
        String[] str = example.split("-");
        for (int i = 0; i <str.length; i++) {
            int temp = mySum(str[i]);
            if(i==0){
                answer += temp;
            }else{
                answer -= temp;
            }
        }
        System.out.println("answer = " + answer);
        


    }
    private static int mySum(String a) {
        int sum = 0;
        //split 할때 + 를 잘못읽음 그래서 [] 를 감싸줘야함.
        String[] temp = a.split("[+]");
        for (int i = 0; i <temp.length ; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
