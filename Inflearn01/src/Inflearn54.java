import java.util.Scanner;
import java.util.Stack;

public class Inflearn54 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char[] arr = scn.next().toCharArray();

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                stack.push(arr[i] - 48);
            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (arr[i] == '+') {
                    stack.push(b + a);
                } else if (arr[i] == '-') {
                    stack.push(b - a);
                } else if (arr[i] == '*') {
                    stack.push(b * a);
                } else if (arr[i] == '/') {
                    stack.push(b / a);
                }
            }
        }
        System.out.println(stack.get(0));
    }
}
