import java.util.LinkedList;
import java.util.Queue;

class Point13 {
    int x, y;

    public Point13(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Practice13 {
    static int answer = 0;
    static int n;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    Queue<Point> queue = new LinkedList<>();

    public void BFS(int x, int y, int[][] board) {
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    BFS(i, j, board);
                    answer++;
                }
            }
        }
    }
}
