import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point8132 {
    public int x, y;

    public Point8132(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Inflearn8132 {
    static int island = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n;
    static Queue<Point8132> q = new LinkedList<>();

    void BFS(int x, int y, int[][] map) {
        q.add(new Point8132(x, y));
        while (!q.isEmpty()) {
            Point8132 pos = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    q.add(new Point8132(nx, ny));
                }
            }
        }
    }

    public void solution(int[][] map) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = 0;
                    BFS(i, j, map);
                    island++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Inflearn8132 inf = new Inflearn8132();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scn.nextInt();
            }
        }
        inf.solution(map);
        System.out.println(island);

    }
}
