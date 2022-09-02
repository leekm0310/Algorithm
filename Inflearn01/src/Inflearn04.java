import java.util.Scanner;

public class Inflearn04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcase = scn.nextInt();
        for (int i = 0; i <= testcase; i++) {
            String word = scn.next();
            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
