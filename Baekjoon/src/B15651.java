import java.util.Scanner;

public class B15651 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[m];
        dfs(n, m, 0, sb, arr);
        System.out.print(sb);

    }

    public static void dfs(int n, int m, int depth, StringBuilder sb, int[] arr) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            dfs(n, m, depth + 1, sb, arr);
        }
    }
}

