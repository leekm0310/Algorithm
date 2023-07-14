import java.util.Scanner;
import java.util.Stack;

public class B1918 {
    public static String postfix(char[] chars) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                sb.append(chars[i]);
            } else {
                if (chars[i] == '(') {
                    stack.push(chars[i]);
                } else if (chars[i] == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }

                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                } else {
                    while (!stack.isEmpty() && prioritize(stack.peek()) >= prioritize(chars[i])) {
                        sb.append(stack.pop());
                    }
                    stack.push(chars[i]);
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static int prioritize(char c) {
        if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[] chars = scn.nextLine().toCharArray();
        System.out.println(postfix(chars));
    }
}
