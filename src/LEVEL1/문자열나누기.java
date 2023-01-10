package LEVEL1;

public class 문자열나누기 {
    public static void main(String[] args) {
        문자열나누기 문자열나누기 = new 문자열나누기();
        String s = "banana";
        String s1 = "abracadabra";
        String s2 = "aaabbaccccabba";
//        System.out.println("s = " + s.substring(1));

        문자열나누기.solution(s2);
    }

    public static int solution(String s) {
        char first = s.charAt(0); // 첫번쨰 문자
        int count = 0;
        int diff = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (first == s.charAt(i)) { //
                count++;
            }else {
                diff++;
            }
            if (count == diff) {
                answer++;
                first = s.charAt(i); //
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}
