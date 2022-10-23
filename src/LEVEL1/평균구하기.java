package LEVEL1;

public class 평균구하기 {
    public double solution(int[] arr) {

        double answer = 0;

        for (int i = 0; i < arr.length ; i++) {
            answer += arr[i];
        }
        answer /= arr.length;

        return answer;
    }

    public static void main(String[] args) {
        평균구하기 sl = new 평균구하기();

        int[] a = {1,2,3,4};
        sl.solution(a);
    }

}
