package LEVEL1;

public class Solution220816_1 {

    class Solution {

        public String[] solution(int n, int[] arr1, int[] arr2) {

            String[] answer = new String[n];
            for (int i = 0; i < n; i++) {

                answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]).replace("1", "#").replace("0", " "));
//                String binary = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i]).toString())).replace("1","#").replace("0"," ");
                System.out.println(answer[i]);

//                System.out.println(binary);
//                binary = binary.replace("1","#");
//                binary = binary.replace("0"," ");
//                System.out.println(binary);
//                answer[i] = binary;

            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution220816_1 sl = new Solution220816_1();
        Solution220816_1.Solution sl2 = sl.new Solution();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        sl2.solution(n, arr1, arr2);

        int n2 = 6;
        int[] arr3 = {46, 33, 33, 22, 31, 50};
        int[] arr4 = {27, 56, 19, 14, 14, 10};

        sl2.solution(n2, arr3, arr4);


//        실행한 결괏값 ["######","###  #","##  ##","#### ","#####","### # "]이
//             기댓값 ["######","###  #","##  ##"," #### "," #####","### # "]과 다릅니다.
    }
}
