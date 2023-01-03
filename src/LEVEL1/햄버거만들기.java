package LEVEL1;

import java.util.Arrays;
import java.util.Stack;

public class 햄버거만들기 {
    public static void main(String[] args) {
        햄버거만들기 햄버거만들기 = new 햄버거만들기();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        햄버거만들기.solution(ingredient);
        //빵(1)-야채(2)-고기(3)-빵(1)
    }
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int[] recipe = {1,2,3,1};

        for (int i : ingredient) {
            st.push(i);
            if(st.size()>= recipe.length){
                if(st.get(st.size()-recipe.length) == recipe[0]
                && st.get(st.size()-(recipe.length-1)) == recipe[1]
                && st.get(st.size()-(recipe.length-2)) == recipe[2]
                && st.get(st.size()-(recipe.length-3)) == recipe[3]){
                    answer++;
                    for (int j = 0; j <recipe.length ; j++) {
                        st.pop();
                    }
                }
            }
        }
        System.out.println(answer);

        return answer;
    }
}



