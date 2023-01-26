package Level2;

import java.util.Stack;

public class Level2_05 {
    static boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
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
