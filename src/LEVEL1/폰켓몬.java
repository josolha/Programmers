package LEVEL1;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/1845

public class 폰켓몬 {


    int[] nums;
    String s;

    public 폰켓몬(int[] nums) {

        this.nums = nums;

        HashSet<Integer> HS = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            HS.add(nums[i]);
        }
        int answer = 0;

        answer = (HS.size() > nums.length / 2) ? nums.length / 2 : HS.size();
//
//        if(answer > nums.length /2 ){
//            answer = nums.length /2;
//        }
        System.out.println(answer);

    }

    public void solution2(String s) {

//            return answer;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};


        폰켓몬 sl = new 폰켓몬(nums1);
        폰켓몬 sl2 = new 폰켓몬(nums2);
        폰켓몬 sl3 = new 폰켓몬(nums3);
//-----------------------------------------
        System.out.println("===========");
        sl.solution2("qwer");



    }

}
