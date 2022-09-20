import java.util.Scanner;

public class Inflearn35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        int count = 0;
        int sum = 0;
        int p2 = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + arr[i];
            if (sum == n) {
                count++;
            }
            while (sum >= n) {
                sum = sum - arr[p2];
                p2++;
                if (sum == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
