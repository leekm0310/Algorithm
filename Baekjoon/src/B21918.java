import java.util.Scanner;

public class B21918 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[] bulbs = new int[N];
        int[] orders = new int[M * 3];
        for (int i = 0; i < bulbs.length; i++) {
            bulbs[i] = scn.nextInt();
        }
        for (int i = 0; i < orders.length; i++) {
            orders[i] = scn.nextInt();
        }

        for (int i = 0; i < orders.length - 2; i = i + 3) {
            int a = orders[i + 1];
            int b = orders[i + 2];
            if (orders[i] == 1) {
                bulbs[a - 1] = b;
            }
            if (orders[i] == 2) {
                for (int j = a - 1; j <= b - 1; j++) {
                    bulbs[j]^= 1;
                }
            }
            if (orders[i] == 3) {
                for (int j = a-1; j <= b-1; j++) {
                    bulbs[j] = 0;
                }
            }
            if (orders[i] == 4) {
                for (int j = a-1; j <= b-1; j++) {
                    bulbs[j] = 1;
                }
            }
        }

        for (int bulb : bulbs) {
            System.out.print(bulb + " ");
        }
    }
}
