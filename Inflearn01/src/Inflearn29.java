import java.util.Scanner;

public class Inflearn29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] numbers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = scn.nextInt();
            }
        }

        int max = 0;
        int sum;
        int sum2;
        for (int i = 0; i < n; i++) {
            sum = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + numbers[i][j];
                sum2 = sum2 + numbers[j][i];
            }
            max = Math.max(max, sum);
            max = Math.max(max, sum2);
        }

        sum = sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i][i];
            sum2 = sum2 + numbers[i][n - i - 1];
        }
        max = Math.max(max, sum);
        max = Math.max(max, sum2);

        System.out.println(max);
    }
}
