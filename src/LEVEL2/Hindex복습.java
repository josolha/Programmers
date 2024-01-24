package LEVEL2;

import java.util.Arrays;

public class Hindex복습 {
    public static void main(String[] args) {
        Hindex복습_Solution sl = new Hindex복습_Solution();
        int[] citations = {3,0,6,1,5};
        System.out.println(sl.solution(citations));
    }

}
class Hindex복습_Solution{
    int[] citations;
    int averageCnt;
    int answer;

    public int solution(int[] citations) {
        this.citations = citations;
        this.averageCnt = citations.length/2;

        Arrays.sort(citations);

        answer = citations[averageCnt];


        return answer;
    }


}
