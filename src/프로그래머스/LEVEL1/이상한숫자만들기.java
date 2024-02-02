package 프로그래머스.LEVEL1;

public class 이상한숫자만들기 {
    public String solution(String s) {
        String answer ="";
        String[] ab = s.split("");
        int idx = 0;


        for (int i = 0; i <ab.length ; i++) {
            if(ab[i].equals(" ")){
                idx = 0;
                answer += " ";
            }else if(idx%2==0){
                answer += ab[i].toUpperCase();
                idx ++;
            }else{
                answer += ab[i].toLowerCase();
                idx ++;
            }

        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        이상한숫자만들기 sl = new 이상한숫자만들기();
        String s = "try hello world";
        sl.solution(s);
        char a = 'i';


    }
}
