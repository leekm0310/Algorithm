import java.util.Scanner;

public class B15652 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[m];
        boolean[] visited = new boolean[n];
        dfs(n, m, 0, 0, arr);
        System.out.println(sb);

    }

    public static void dfs(int n, int m, int depth, int start,  int[] arr) {
        if (depth == m) {
            for (int i : arr) {
                sb.append(i + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < n; i++) {
            arr[depth] = i + 1;
            dfs(n, m, depth + 1, i, arr);

        }
    }
}
