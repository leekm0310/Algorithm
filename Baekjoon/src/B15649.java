import java.util.Scanner;

public class B15649 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        boolean[] visit = new boolean[n];
        int[] arr = new int[m];
        func(visit, arr, n, m, 0);
    }

    public static void func(boolean[] visit, int[] arr, int n, int m, int start) {
        if (start == m) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[start] = i + 1;
                func(visit, arr, n, m, start+1);
                visit[i] = false;
            }
        }
        return;
    }
}
