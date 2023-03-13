import java.util.Arrays;
import java.util.Scanner;

public class Inflearn105 {
    public static int solution(int[] coins, int money) {
        int[] dy = new int[money + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dy.length; j++) {
                dy[j] = Math.min(dy[j], dy[j - coins[i]] + 1);
            }
        }
        return dy[money];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int[] coins = new int[a];
        for (int i = 0; i < a; i++) {
            coins[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        System.out.println(solution(coins, b));
    }
}
