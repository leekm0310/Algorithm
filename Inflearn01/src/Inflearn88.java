import java.util.Scanner;

public class Inflearn88 {

    static int n;
    static int f;
    static int[] a; // 콤비네이션 게산해서 넣은 배열
    static int[] b; //
    static int[] checked;
    int[][] dy = new int[35][35];
    boolean flag = false;

    public int calculate(int n, int r) {
        if (dy[n][r] < 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = calculate(n - 1, r - 1) + calculate(n - 1, r);
        }
    }

    void DFS(int L, int sum) {
        if (flag) {
            return;
        }
        if (L == n) {
            if (sum == f) {
                for (int x : b) {
                    System.out.print(x + " ");
                }
                flag = true;
            }

        } else {
            for (int i = 1; i <= n; i++) {
                if (checked[i] == 0) {
                    checked[i] = 1;
                    b[L] = i; // i값 자체가 순열을 하는 숫
                    DFS(L + 1, sum + (b[L] * a[L]));
                    checked[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Inflearn88 inf = new Inflearn88();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        f = scn.nextInt();
        a = new int[n];
        b = new int[n];
        checked = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = inf.calculate(n - 1, i);
        }
        inf.DFS(0,0);
    }
}
