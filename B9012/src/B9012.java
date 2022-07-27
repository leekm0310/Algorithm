import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++){
            sb.append(popBrackets(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }

    public static String popBrackets(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '('){
                stack.push(c);
            } else if (stack.empty()){
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.empty()){
            return "YES";
        } else {
            return "NO";
        }
    }
}
