public class Leetcode200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int d = 0; d < dx.length; d++) {
            int nx = i + dx[d];
            int ny = j + dy[d];
            if (nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length && grid[nx][ny] == '1') {
                grid[nx][ny] = '0';
                dfs(grid, nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode200 l = new Leetcode200();
        char[][] arr = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        System.out.println(l.numIslands(arr));

    }
}
