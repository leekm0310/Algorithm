import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int answer = 0;
        int[][] board = {
                {0, 0, 0, 0, 0},  //4
                {0, 0, 1, 0, 3},  //3
                {0, 2, 5, 0, 1},  //2
                {4, 2, 4, 4, 2},  //1
                {3, 5, 1, 3, 1}}; //0
        int[] moves = {1, 5, 3, 5};

        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            int col = move - 1;

            for (int row = 0; row < board[0].length; row++) {
                int target = board[row][col];

                if (target != 0) {
                    board[row][col] = 0;

                    if (!stack.isEmpty() && stack.peek() == target) {
                        stack.pop();
                        answer += 2;
                        break;
                    }
                    stack.push(target);
                    break;
                }
            }
            System.out.println(answer);


        }
    }
}