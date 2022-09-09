import java.util.Scanner;

public class Inflearn23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cases = scn.nextInt();
        int[] a = new int[cases];
        for (int i = 0; i < cases; i++) {
            a[i] = scn.nextInt();
        }
        int[] b = new int[cases];
        for (int i = 0; i < cases; i++) {
            b[i] = scn.nextInt();
        }

        for (int i = 0; i < cases; i++) {
            if (a[i] == b[i]) {
                System.out.println("D");
            } else if (a[i] == 1 && b[i] == 3) {
                System.out.println("A");
            } else if (a[i] == 2 && b[i] == 1) {
                System.out.println("A");
            } else if (a[i] == 3 && b[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
