import java.util.Scanner;
import java.util.Stack;

public class Inflearn51 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] arr = scn.next().split("");

        Stack stack = new Stack();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek().equals("(") && arr[i].equals(")")) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
