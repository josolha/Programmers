package 프로그래머스.LEVEL1;

public class 문자열내P와Y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        char ch ='y';
        char ch1 ='p';
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i)== ch){
                count++;
            }else if(s.charAt(i)== ch1){
                count1++;
            }
        }
        if (count1 == count){
            answer = true;
        }else{
            answer = false;
        }

        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        문자열내P와Y의개수 sl = new 문자열내P와Y의개수();
        String a = "pPooY";
        sl.solution(a);
//        int ab = 1;
//        DecimalFormat df = new DecimalFormat("00");
//        System.out.println((int)df.format(ab));


    }
}
