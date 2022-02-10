import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        for (int i = 1; i <= target; i++) {

        }


        for (int i = 1; i <= target; i++) {
            int a = (2 * i) - 1;
            for (int k = i; k < target; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
