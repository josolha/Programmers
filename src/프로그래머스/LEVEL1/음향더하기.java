package 프로그래머스.LEVEL1;

public class 음향더하기 {
    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {

            if(signs[i] == true){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }

        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        음향더하기 sl = new 음향더하기();

        int[] arr = {4,7,12};
        boolean[] b = {true,false,true};

        sl.solution(arr,b);
    }
}
