import java.util.Arrays;
import java.util.Scanner;

public class B15656 {

    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int[] result = new int[m];
        dfs(n, m, 0 , arr, result);
        System.out.println(sb);

    }

    public static void dfs(int n, int m, int depth, int[] arr, int[] result) {
        if (depth == m) {
            for (int i : result) {
                sb.append(i + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            result[depth] = arr[i];
            dfs(n, m, depth + 1, arr, result);
        }
    }
}
