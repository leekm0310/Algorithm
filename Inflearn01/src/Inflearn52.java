import java.util.Scanner;
import java.util.Stack;

public class Inflearn52 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] arr = scn.next().split("");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(")")) {
                while (!stack.pop().equals("("));
            } else {
                stack.push(arr[i]);
            }
        }

        String answer = "";
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        System.out.println(answer);
    }
}
