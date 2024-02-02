package 프로그래머스.LEVEL1;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";
        Solution sl = new Solution();
        sl.solution(t,p);

    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int cnt = 0;

        for (int i = 0; i <t.length()-p.length()+1 ; i++) {
            String temp = t.substring(i,p.length()+i);
            if(Long.parseLong(temp) <= Long.parseLong(p)){
                answer++;
            }
            System.out.println(temp);
        }
        System.out.println("answer = " + answer);

        return answer;

        // 스트림 식으로 해보기
    }
    // 314,
    //  141,
    //   415,
    //    159,
    //     592

}
