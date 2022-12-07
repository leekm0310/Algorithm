import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point1 {
    public int x, y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Inflearn812 {
    static int[][] box;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    static int[][] checked;
    static Queue<Point1> q = new LinkedList<>();
    static int m,n;

    void BFS(int x, int y) {
        while (!q.isEmpty()) {
            Point1 tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
                    box[nx][ny] = 1;
                    q.offer(new Point1(nx, ny));
                    checked[nx][ny] = checked[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Inflearn812 inf = new Inflearn812();
        Scanner scn = new Scanner(System.in);
        m = scn.nextInt();
        n = scn.nextInt();

        box = new int[n][m];
        checked = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = scn.nextInt();
                if (box[i][j] == 1) {
                    q.offer(new Point1(i, j));
                }
            }
        }

        inf.BFS(0,0);
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, checked[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }


    }
}
