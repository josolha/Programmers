package LEVEL1;

import java.util.Arrays;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {

        String answer = "";

        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }

        answer += phone_number.substring(phone_number.length()-4);
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        핸드폰번호가리기 sl = new 핸드폰번호가리기();
        String phone_number = "01052056266";
        sl.solution(phone_number);

    }
}
