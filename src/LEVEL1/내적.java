package LEVEL1;

public class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i <a.length ; i++) {
            answer += a[i]*b[i];

        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        내적 sl = new 내적();
        int[]a = {1,2,3,4};
        int[]b = {-3,-1,0,2};
        sl.solution(a,b);
    }

}
