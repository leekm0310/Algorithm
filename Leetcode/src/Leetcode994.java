import java.util.LinkedList;
import java.util.Queue;

public class Leetcode994 {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int count = 0;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty() && fresh != 0) {
            count++;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] rotten = q.poll();
                int x = rotten[0];
                int y = rotten[1];

                for (int[] direction : directions) {
                    int nx = x + direction[0];
                    int ny = y + direction[1];
                    if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        q.offer(new int[]{nx, ny});
                        fresh--;
                    }
                }
            }
        }
        if (fresh == 0) {
            return count;
        }
        return -1;
    }
}
