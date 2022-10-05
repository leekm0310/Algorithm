import java.util.Scanner;
import java.util.Stack;

public class Inflearn55 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int answer = 0;
        String str = scn.next();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push('(');
            } else {
                s.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += s.size();
                } else {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
