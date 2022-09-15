import java.util.Scanner;

public class Inflearn27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] answers = new int[n];

        for (int i = 0; i < n; i++) {
            answers[i] =scn.nextInt();
        }

        int bonus = 0;
        int total = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 1) {
                bonus++;
            } else {
                bonus = 0;
            }
            total = total + bonus;
        }

        System.out.println(total);
    }
}
