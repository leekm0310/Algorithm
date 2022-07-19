import java.util.Scanner;

public class B2579 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int stair = scn.nextInt();
        int[] arr = new int[301];
        int[] dp = new int[301];

        for (int i = 1; i <= stair; i++) {
            arr[i] = scn.nextInt();
        }

        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        dp[3] = Math.max(arr[1], arr[2]) + arr[3];

        for (int n = 4; n <= stair; n++) {
            dp[n] = Math.max(dp[n - 3] + arr[n - 1], dp[n - 2]) + arr[n];
        }

        System.out.println(dp[stair]);

    }
}
