import java.util.Scanner;

public class Inflearn82 {
    static int answer = Integer.MIN_VALUE;
    static int n;
    static int c;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }


    public static void main(String[] args) {
        Inflearn82 inflearn82 = new Inflearn82();
        Scanner scn = new Scanner(System.in);
        c = scn.nextInt();
        n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        inflearn82.DFS(0,0, arr);
        System.out.println(answer);
    }

}
