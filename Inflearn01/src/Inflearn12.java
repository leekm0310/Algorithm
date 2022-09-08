import java.util.Scanner;

public class Inflearn12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int wordCount = scn.nextInt();
        String str = scn.next();

        String s = str.replaceAll("[#]", String.valueOf(1)).replaceAll("[*]", String.valueOf(0));
        String answer = "";
        for (int i = 1; i <= wordCount; i++) {
            int number = Integer.parseInt(s.substring(7 * (i - 1), 7 * i), 2);
            answer += (char)number;
        }
        System.out.println(answer);
    }
}
