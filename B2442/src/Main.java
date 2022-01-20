import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.close();
        for (int i = 1; i <= a; i++) {
            int b = (2 * i) - 1;

            for (int k = i; k < a; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}