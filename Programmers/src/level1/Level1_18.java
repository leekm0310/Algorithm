package level1;

import java.util.Stack;

public class Level1_18 {
    public Stack<Integer>  solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!stack.peek().equals(arr[i])) {
                stack.push(arr[i]);
            }
        }
        return stack;
    }
}
