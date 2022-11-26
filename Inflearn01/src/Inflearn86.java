import java.util.Scanner;

public class Inflearn86 {

    static int n;
    static int m;
    static int[] arr;
    static int[] checked;
    static int[] answers;


    void DFS(int L) {
        if (L == m) {
            for (int x : answers) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (checked[i] == 0) {
                    checked[i] = 1;
                    answers[L] = arr[i];
                    DFS(L + 1);
                    checked[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Inflearn86 inflearn86 = new Inflearn86();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        checked = new int[n];
        answers = new int[m];
        inflearn86.DFS(0);

    }
}
