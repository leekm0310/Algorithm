import java.util.Arrays;
import java.util.Scanner;

public class B15655 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        int[] result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }


        Arrays.sort(arr);
        dfs(n, m, 0, 0, arr, result, visited);
        System.out.println(sb);

    }

    public static void dfs(int n, int m, int depth, int start, int[] arr, int[] result, boolean[] visited) {
        if (depth == m) {
            for (int i : result) {
                sb.append(i + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(n, m, depth+1, i, arr, result, visited);
                visited[i] = false;
            }
        }

    }
}
