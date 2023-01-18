package level1;

import java.util.Stack;

public class Level1_24 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i] == 1 && stack.size() >= 3 && stack.peek().equals(3) &&
                    stack.lastIndexOf(2) == stack.size() - 2 && stack.lastIndexOf(1) == stack.size() -3) {
                answer++;
                stack.pop();
                stack.pop();
                stack.pop();
            } else {
                stack.push(ingredient[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(a));
    }
}
