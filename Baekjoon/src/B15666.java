import java.util.Arrays;
import java.util.Scanner;

public class B15666 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[n];
        int[] result = new int[m];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);
        dfs(n, m, 0, 0, arr, result);
        System.out.println(sb);
    }

    public static void dfs(int n, int m, int depth, int start, int[] arr, int[] result) {
        if (depth == m) {
            for (int i : result) {
                sb.append(i + " ");
            }
            sb.append('\n');
            return;
        }

        int before = 0;
        for (int i = start; i < n; i++) {
            if (before != arr[i]) {
                result[depth] = arr[i];
                before = arr[i];
                dfs(n, m, depth + 1, i, arr, result);
            }

        }
    }
}
