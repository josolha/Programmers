package 완전탐색;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 조합테스트 {
    static List<String> list = new ArrayList<>();
    static Set<Integer> set = new HashSet<>();
    static String[] arr = {"1","2","3"};
    static boolean[] used = new boolean[arr.length];



    public static void main(String[] args) {

        recursive("");

        //System.out.println(list.toString());

        System.out.println(set);

    }

    private static void recursive(String current) {
        if (!current.isEmpty()) {
            set.add(Integer.parseInt(current));
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                recursive(current + arr[i]);
                used[i] = false; // 백트래킹을 사용하여 사용 상태를 초기화
            }
        }
    }
}
