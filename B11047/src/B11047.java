import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = scn.nextInt();
        }

        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (coin[i] <= k) {
                count += (k / coin[i]);
                k = k % coin[i];
            }
        }
        System.out.println(count);
    }
}
