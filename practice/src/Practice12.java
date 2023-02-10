import java.util.LinkedList;
import java.util.Queue;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Practice12 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] board, dis;
    static int n, m;
    static Queue<Point> q = new LinkedList<>();

    public void BFS() {
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

}
