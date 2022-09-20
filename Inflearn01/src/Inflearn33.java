import java.util.Scanner;

public class Inflearn33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int total = 0;
        for (int i = 0; i < k; i++) {
            total += arr[i];
        }
        int max = total;

        for (int i = k; i < n; i++) {
            total = total + arr[i] - arr[i-k];
            if (total > max) {
                max = total;
            }
        }
        System.out.println(max);
    }
}
