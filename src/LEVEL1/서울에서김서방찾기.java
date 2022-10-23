package LEVEL1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {

        String answer = "";

        for (int i = 0; i <seoul.length ; i++) {
            if (seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
                // == , equals 차이점 알고 가기
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        서울에서김서방찾기 sl = new 서울에서김서방찾기();
        String[] arr = {"Jane","jo","Kim"};
        sl.solution(arr);
    }
}
