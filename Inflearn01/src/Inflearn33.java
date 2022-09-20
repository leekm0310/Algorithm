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

        int max = 0;
        int total = 0;
        for (int i = 0; i < n - k; i++) {
            for (int j = i; j < i + k; j++) {
                total += arr[j];
                if (total > max) {
                    max = total;
                }
            }

            total = 0;
        }
        System.out.println(max);
    }
}
