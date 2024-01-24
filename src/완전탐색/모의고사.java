package 완전탐색;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {

        모의고사_Solution sl = new 모의고사_Solution();

        int[] answers = {1,3,2,4,2};
        System.out.println(sl.solution(answers));
    }
}
class 모의고사_Solution{

    int[] a = {1,2,3,4,5};
    int[] b = {2,1,2,3,2,4,2,5};
    int[] c = {3,3,1,1,2,2,4,4,5,5};

    int[] answers;

    public int[] solution(int[] answers) {
        this.answers = answers;
        List<Integer> list = new ArrayList<>();

        int cnt1=0;
        int cnt2=0;
        int cnt3=0;

        for (int i = 0; i < answers.length ; i++) {
            if(answers[i] == a[i % a.length]){
                cnt1++;
            }
            if(answers[i] == b[i % b.length]){
                cnt2++;
            }
            if(answers[i] == c[i % c.length]){
                cnt3++;
            }
        }
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);

        int max = Math.max(Math.max(cnt1 ,cnt2),cnt3);

        if( max == cnt1){
            list.add(1);
        }if( max == cnt2){
            list.add(2);
        }if( max == cnt3){
            list.add(3);
        }
        System.out.println(list.toString());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

