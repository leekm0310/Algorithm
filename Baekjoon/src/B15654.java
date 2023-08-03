import java.util.Arrays;
import java.util.Scanner;

public class B15654 {

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
        boolean[] visited = new boolean[n];
        dfs(n, m, 0, arr, result, visited);
        System.out.print(sb);
    }

    public static void dfs(int n, int m, int depth, int[] arr, int[] result, boolean[] visited) {
        if (depth == m) {
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i] + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(n, m, depth + 1, arr, result, visited);
                visited[i] = false;
            }
        }
        return;
    }
}
