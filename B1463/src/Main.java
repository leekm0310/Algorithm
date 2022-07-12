import java.util.Scanner;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        dp = new Integer[a + 1];
        dp[0] = dp[1] = 0;

        System.out.println(cal(a));
    }

    public static int cal(int a) {
        if (dp[a] == null) {
            if (a % 6 == 0) {
                dp[a] = Math.min(cal(a - 1), Math.min(cal(a / 3), cal(a / 2))) + 1;
            } else if (a % 3 == 0) {
                dp[a] = Math.min(cal(a / 3), cal(a - 1)) + 1;
            } else if (a % 2 == 0) {
                dp[a] = Math.min(cal(a / 2), cal(a - 1)) + 1;
            } else {
                dp[a] = cal(a - 1) + 1;
            }
        }
        return dp[a];
    }
}
