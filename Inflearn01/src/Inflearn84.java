import java.util.Scanner;

public class Inflearn84 {

    static int[] pm;
    static int n;
    static int m;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Inflearn84 inflearn84 = new Inflearn84();
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        m = scn.nextInt();
        pm = new int[m];
        inflearn84.DFS(0);
    }
}
