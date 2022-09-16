import java.util.Scanner;

public class Inflearn211 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int cnt;
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
