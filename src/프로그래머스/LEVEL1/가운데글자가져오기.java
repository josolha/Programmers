package 프로그래머스.LEVEL1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class 가운데글자가져오기 {

    public static void main(String[] args) {

        가운데글자가져오기 s2 = new 가운데글자가져오기();

        System.out.println(s2.solution("abcjnjjde"));

    }

    public StringBuffer solution(String s){

        StringBuffer sf = new StringBuffer();

        int Middle = s.length()/2;

        if(s.length() % 2 == 1){
            char c = s.charAt(Middle);
            sf.append(String.valueOf(c));

        }else{
            sf.append(String.valueOf(s.charAt(Middle-1)));
            sf.append(String.valueOf(s.charAt(Middle)));

        }

        System.out.println(s); // 출력
        System.out.println(sf);

        return sf;
    }

}
