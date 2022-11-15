import java.util.Scanner;

public class Inflearn81 {
    static String answer = "NO";
    static int n = 0;
    static int total = 0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (sum > total / 2) {
            return;
        }
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Inflearn81 I = new Inflearn81();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            total += arr[i];
        }
        I.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
