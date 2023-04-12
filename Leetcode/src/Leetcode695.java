public class Leetcode695 {
    int size = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int answer = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    size = 0;
                    dfs(grid, i, j, m, n, visited);
                    answer = Math.max(size, answer);
                }
            }
        }
        return answer;
    }

    public void dfs(int[][] grid, int i, int j, int m, int n, int[][] visited) {
        visited[i][j] = 1;
        size++;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int a = 0; a < dx.length; a++) {
            int nx = i + dx[a];
            int ny = j + dy[a];

            if (nx >= 0 && ny >= 0 && nx < m && ny < n && grid[nx][ny] == 1 && visited[nx][ny] == 0) {
                dfs(grid, nx, ny, m, n, visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int[][] arr2 = {{0, 1}};
        Leetcode695 l = new Leetcode695();
        System.out.println(l.maxAreaOfIsland(arr2));

    }
}
