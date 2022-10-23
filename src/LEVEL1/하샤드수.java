package LEVEL1;

public class 하샤드수 {

    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int num = x;

        while(num>0){
            sum += num%10;
            num = num/10;
        }

        if(x%sum != 0){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        하샤드수  sl = new 하샤드수();
        int a = 13;
        sl.solution(a);
    }
}
