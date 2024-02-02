package 프로그래머스.LEVEL1;

public class 시저암호 {
    public String solution(String s, int n) {

        String answer = "";

//        for (int i = 0; i <s.length() ; i++) {
//            // 범위 주기 122 넘어가면 65부터 시작
//            if( (int)s.charAt(i)>= 65 && 90 >= (int)s.charAt(i) ) {
//                if ((int)s.charAt(i)+n > 90) {
//                    answer += (char) (int) (n % 90 + 64);
//                }else{
//                    answer += (char) ((int) (s.charAt(i)) + n );
//                }
//
//            }else if((int)s.charAt(i) >=97 && 122 >= (int)s.charAt(i)) {
//                if ((int) s.charAt(i) + n > 122) {
//                    answer += (char) (int) (n % 122 + 96);
//                } else {
//                    answer += (char) ((int) (s.charAt(i)) + n);
//                }
//            }else{
//                answer += " ";
//            }
//        }
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)) { //소문자
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(ch)) { //대문자
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }

            answer += ch;
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        시저암호 sl = new 시저암호();
        String s = "a B z";
        int n = 4;
        sl.solution(s,n);

        //65 ~122  // 아스키코드 알파벳
        //대문자  65 ~ 90 , 소문자 97 ~122
//        String sr = "ab";
//        char v= (char)((int)sr.charAt(1)+1);
//        System.out.println(v);

//        Character a = 'z'+1;
//        Integer  w = 1;
//        System.out.println(a);
    }

}
