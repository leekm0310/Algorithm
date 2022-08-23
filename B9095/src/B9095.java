import java.util.Scanner;

public class B9095 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int k = 4; k <= 10; k++) {
            dp[k] = dp[k - 3] + dp[k - 2] + dp[k - 1];
        }

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            System.out.println(dp[n]);
        }
    }
}
