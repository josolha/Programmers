package 완전탐색;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 최소직사각형 {
    public static void main(String[] args) {
        최소직사각형_Solution sl = new 최소직사각형_Solution();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(sl.solution(sizes));
    }

}

class 최소직사각형_Solution {

    int[][] sizes;

    int answer;

    List<Integer> list2 = new ArrayList<>();

    int 가로 = 0;
    int 세로 = 0;

    public int solution(int[][] sizes) {
        this.answer = 0;
        this.sizes = sizes;

        for (int i = 0; i < sizes.length; i++) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(sizes[i][0]);
            list1.add(sizes[i][1]);
            list1.sort(Comparator.reverseOrder());
            가로 = Math.max(가로, list1.get(0));
            세로 = Math.max(세로, list1.get(1));
        }
        return 가로 * 세로;
    }
}
