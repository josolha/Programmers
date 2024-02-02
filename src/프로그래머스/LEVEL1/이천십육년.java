package 프로그래머스.LEVEL1;

public class 이천십육년 {
    public String solution(int a, int b) {

        String answer = "";

        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int [] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int date = 0;

        for (int i = 0; i < a-1 ; i++) {
            date += month[i];
        }
        date += (b-1);
        // ex) 1월 3일 = 3 % 7 = 3, 인덱스때문에 -1 이네
        //
        answer = day[date % 7];

        return answer;


    }

    public static void main(String[] args) {
        이천십육년 sl = new 이천십육년();
        int a = 5;
        int b = 24;
        sl.solution(a,b);
        //일 월 화 수 목 금 토 일
        // 2016 1월 1일은 금
        // 월 31,29,31,30,31,30,31,31,30,31,30,31
        //

    }
}
