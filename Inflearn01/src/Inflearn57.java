import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inflearn57 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String e = scn.next();
        String p = scn.next();

        String answer = "YES";

        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < e.length(); i++) {
            q.offer(e.charAt(i));
        }

        for (int i = 0; i < p.length(); i++) {
            if (q.contains(p.charAt(i))) {
                if (p.charAt(i) != q.poll()) {
                    answer = "NO";
                }
            }
        }
        if (!q.isEmpty()) {
            answer = "NO";
        }
        System.out.println(answer);
    }
}
