package Level2;

import java.util.Stack;

public class Level2_05 {
    static boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (stack.size() >= 2) {
                if (stack.peek().equals(')') && stack.elementAt(stack.size() - 2).equals('(')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            answer = true;
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("(())()"));

    }
}
