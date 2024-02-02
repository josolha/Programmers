package 프로그래머스.LEVEL1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {

        String answer = "";

        String[] a = s.split("");

        Arrays.sort(a);

        StringBuffer sb = new StringBuffer();

        for (int i = a.length -1; i >=0 ; i--) {
            sb.append(a[i]);
        }

        answer = sb.toString();

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        문자열내림차순으로배치하기 sl = new 문자열내림차순으로배치하기();
        String s = "Zbcdefg";
        sl.solution(s);
        // ===========================

        // s.spilt
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        StringBuffer sb3 = new StringBuffer();

        for (int i = arr.length -1; i >=0 ; i--) {
            sb3.append(arr[i]);
        }
        System.out.println(sb3.toString());

        // 그대로 넣기
        String[] arr2 = {s};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        StringBuffer sb4 = new StringBuffer();

        for (int i = arr2.length -1; i >=0 ; i--) {
            sb4.append(arr2[i]);
        }
        System.out.println(sb4.toString());

    }

}
