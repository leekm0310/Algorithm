import java.util.Scanner;

public class Inflearn87 {
    int[][] dy = new int[35][35];

    int DFS(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Inflearn87 inflearn87 = new Inflearn87();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        System.out.println(inflearn87.DFS(n, r));

    }
}
