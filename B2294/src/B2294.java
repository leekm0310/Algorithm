import java.util.Arrays;
import java.util.Scanner;

public class B2294 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = scn.nextInt();
        }

        int[] dp = new int[k+1];
        Arrays.fill(dp, 100001);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j < k+1; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]]+1);
            }
        }
        System.out.println(dp[k] ==100001? -1 :dp[k]);

    }
}
