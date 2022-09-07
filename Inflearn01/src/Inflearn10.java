import java.util.Scanner;

public class Inflearn10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        char t = scn.next().charAt(0);

        int p = 1000;
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = p;
            }
        }

        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                result[i] = Math.min(result[i], p);
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
