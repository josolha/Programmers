package LEVEL1;

public class 수박수박수박수박 {
    public String solution(int n) {

        String answer = "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박";
        answer = answer.substring(0,n);
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        수박수박수박수박 sl = new 수박수박수박수박();

        int n = 3;
        int n2 = 4;
        sl.solution(n);
    }
}
