import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inflearn83 {

    static int n;
    static int m;
    static int answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int t, int[] a, int[] b) {
        if (t > m) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + a[L], t + b[L], a, b);
            DFS(L + 1, sum, t, a, b);
        }
    }

    public static void main(String[] args) {
        Inflearn83 inflearn83 = new Inflearn83();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
            b[i] = scn.nextInt();
        }
        inflearn83.DFS(0,0,0,a,b);
        System.out.println(answer);
    }
}
