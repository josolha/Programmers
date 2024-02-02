package 프로그래머스.LEVEL1;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};

//        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5,
//        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,
//        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
                // {1,3,2,4,2}

        int cnt1 =0;
        int cnt2 =0;
        int cnt3 =0;

        // 만약에 7일때
        //1, 1,
        // 7, 7 -> 2 가 되어야함.
        for (int i = 0; i < answers.length; i++) {


            if (answers[i] == a1[i % a1.length]) {
                //
                // answer[10] == a1[]
                cnt1++;
            }
            if(answers[i] == a2[i % a2.length]){
                cnt2++;
            }
            if(answers[i] == a3[i % a3.length]){
                cnt3++;
            }
        }

        int max = Math.max(Math.max(cnt1,cnt2),cnt3);

        ArrayList<Integer> list = new ArrayList<>();

        if (max==cnt1){
            list.add(1);
        }
        if (max==cnt2){
            list.add(2);
        }
        if (max==cnt3){
            list.add(3);
        }

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }


        System.out.println(cnt1+","+cnt2+","+cnt3);

        return answer;
    }

    public static void main(String[] args) {
        모의고사 sl = new 모의고사();

        int[] answers = {1,3,2,4,2};

        sl.solution(answers);

        System.out.println(10%10);
    }
}
