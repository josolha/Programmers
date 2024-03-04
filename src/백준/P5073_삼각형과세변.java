package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P5073_삼각형과세변 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            Integer[] arr = new Integer[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, Comparator.reverseOrder());

            if (getSum(arr) == 0) {
                break;
            }

            if (!checkAngle(arr)) {
                System.out.println("Invalid");
            } else {
                int cnt = checkCntEqual(arr);
                grade(cnt);
            }
        }
    }

    private static int getSum(Integer[] arr) {
        int sum =0;
        for (int num: arr) {
            sum+=num;
        }
        return sum;
    }

    private static boolean checkAngle(Integer[] arr) {
       return arr[0] < arr[1] + arr[2];
    }

    private static void grade(int cnt) {
        if (cnt == 1 || cnt == 3) { // 삼각형이 등변이거나 정삼각형인 경우
            System.out.println(cnt == 3 ? "Equilateral" : "Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
    private static int checkCntEqual(Integer[] arr) {
        int equalCnt = 0;
        if (arr[0].equals(arr[1])) equalCnt++;
        if (arr[1].equals(arr[2])) equalCnt++;
        if (arr[0].equals(arr[2])) equalCnt++;
        return equalCnt > 0 ? (equalCnt == 1 ? 1 : 3) : 0; // 등변삼각형을 위한 처리
    }
//    private static int checkCntEqual(Integer[] arr) {
//        int equalCnt =0;
//        if(arr[0]==arr[1]){
//            equalCnt++;
//        }if(arr[0]==arr[2]){
//            equalCnt++;
//        }if(arr[1]==arr[2]){
//            equalCnt++;
//        }
//        return equalCnt;
//    }
}
