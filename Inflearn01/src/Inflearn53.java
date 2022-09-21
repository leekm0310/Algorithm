import java.util.Scanner;
import java.util.Stack;

public class Inflearn53 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scn.nextInt();
            }
        }

        int m = scn.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scn.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int a = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i] - 1;
            for (int j = 0; j < n; j++) {
                int target = board[j][a];
                if (target != 0) {
                    board[j][a] = 0;
                    if (!stack.isEmpty() && stack.peek() == target) {
                        stack.pop();
                        count = count + 2;
                        break;
                    }
                    stack.push(target);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
