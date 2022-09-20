import java.util.Scanner;

public class Inflearn34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int count = 0;
        int sum = 0;
        int p2 = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == m) {
                count++;
            }
            while(sum >= m) {
                sum = sum - arr[p2];
                p2++;
                if (sum == m) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
