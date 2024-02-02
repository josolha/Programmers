package 프로그래머스.LEVEL1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n ; i++) {
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        나머지가1이되는수찾기 sl = new 나머지가1이되는수찾기();

        int a = 12;
        System.out.println(sl.solution(a));


    }
}
