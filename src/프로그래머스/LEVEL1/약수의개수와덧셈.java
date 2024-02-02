package 프로그래머스.LEVEL1;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;

        //약수의 개수를 구해라

        for (int i = left; i < right+1 ; i++) {

            for (int j = 1; j < i+1 ; j++) {
                if(i%j ==0){
                    cnt++;
                }
            }if(cnt%2==0){
                answer += i;
                cnt=0;
            }else{
                answer -= i;
                cnt=0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        약수의개수와덧셈 sl = new 약수의개수와덧셈();
        int left = 13;
        int right = 17;

        sl.solution(left,right);
    }
}