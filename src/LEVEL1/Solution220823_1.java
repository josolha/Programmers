package LEVEL1;

import java.util.Stack;

public class Solution220823_1 {

    public int solution(int[][] board, int[] moves) {

        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < moves.length ; i++) {

            for (int j = 0; j < board.length ; j++) {

                if(board[j][moves[i]-1] > 0){

                    if(stack.peek() == board[j][moves[i]-1]){
                        stack.pop();
                        answer +=2 ;
                    }else{
                        stack.push(board[j][moves[i]-1]);

                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},  // [0][0]
                         {0,0,1,0,3},   // [1][0]
                         {0,2,5,0,1},   // [2][0]
                         {4,2,4,4,2},
                         {3,5,1,3,1}};
//        {{0,0,0,0,0},  // [0][0]
//         {0,0,0,0,0},   // [1][0]
//         {0,0,5,0,0},   // [2][0]
//         {0,2,4,0,2},
//         {0,5,1,3,1}};

        int[] moves = {1,5,3,5,1,2,1,4};  //8   i 0 -> j 5
                    // 4,3,1,1,3,2,4,
        // moves[0] ,1 ->  for문  board [j][0]

        Solution220823_1 sl =new Solution220823_1();
        sl.solution(board,moves);

//       K=0 ~ 7
//       if  (0  != 4 )
//           if 4 == 3
//

    }
}
