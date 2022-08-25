import java.util.Scanner;

public class B2156 {

    static Integer[] dp;
    static int[] wines;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        wines = new int[n + 1];
        dp = new Integer[n + 1];

        for (int i = 1; i < n + 1; i++) {
            wines[i] = scn.nextInt();
        }

        dp[0] = 0;
        dp[1] = wines[1];

        if (n > 1) {
            dp[2] = wines[1] + wines[2];
        }

        System.out.println(cal(n));

    }

    public static int cal(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(Math.max(cal(n - 2), cal(n - 3) + wines[n - 1]) + wines[n],
                    cal(n - 1));
        }
        return dp[n];
    }
}
