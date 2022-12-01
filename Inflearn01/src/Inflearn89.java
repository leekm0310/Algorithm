import java.util.Scanner;

public class Inflearn89 {

    static int n;
    static int m;
    static int[] arr;

    void DFS(int L, int s) {
        if (L == m) {
            for (int x : arr) {
                System.out.print(x+ " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                arr[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }


    public static void main(String[] args) {
        Inflearn89 inf = new Inflearn89();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();
        arr = new int[m];
        inf.DFS(0, 1);

    }
}
