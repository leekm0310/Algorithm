import java.util.Scanner;

public class B15650 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[m];

        func(arr, n, m, 1, 0);

    }

    public static void func(int[] arr, int n, int m, int start, int depth) {
        if (depth == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            func(arr, n, m, i + 1, depth + 1);
        }
    }
}
