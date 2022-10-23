package LEVEL1;

public class 자릿수더하기 {
    public int solution(int n){

        int answer = 0;

        String s  = Integer.toString(n);


        for (int i = 0; i < s.length() ; i++) {
            answer += Integer.parseInt(s.substring(i,i+1));
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 sl = new 자릿수더하기();

        int a = 123;
        sl.solution(a);


//        int length = (int)(Math.log10(a)+1);

//        System.out.println(length);;

    }
}
