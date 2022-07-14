import java.util.Scanner;

public class B1010 {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int testcase = scn.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testcase; i++) {
            int n = scn.nextInt();
            int m = scn.nextInt();

            sb.append(calculator(m, n)).append('\n');
        }
        System.out.println(sb);
    }

    static int calculator(int a, int b) {
        if (dp[a][b] > 0) {
            return dp[a][b];
        }

        if (a == b || b == 0) {
            return dp[a][b] = 1;
        }

        return dp[a][b] = calculator(a - 1, b - 1) + calculator(a - 1, b);
    }
}
