import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Leetcode22 {
    Stack<Character> stack = new Stack<>();
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return result;
    }

    private void backtrack(int open, int close, int n) {
        if (open == close && close == n) {
            Iterator<Character> iterator = stack.iterator();
            String temp = "";
            while (iterator.hasNext()) {
                temp = temp + iterator.next();
            }
            result.add(temp);
        }

        if (open < n) {
            stack.push('(');
            backtrack(open + 1, close, n);
            stack.pop();
        }

        if (close < open) {
            stack.push(')');
            backtrack(open, close + 1, n);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Leetcode22 l = new Leetcode22();
        List<String> strings = l.generateParenthesis(3);
        System.out.println(strings.size());
    }
}
