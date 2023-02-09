public class Practice10 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] checked;
    public void DFS(int a) {
        if (a == n) {
            answer++;
        } else {
            for (int i = 0; i <= n; i++) {
                if (graph[a][i] == 1 && checked[i] == 0) {
                    checked[i] = 1;
                    DFS(i);
                    checked[i] = 0;
                }
            }
        }
    }

}
