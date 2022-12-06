import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Inflearn811 {
    static int[][] map;
    static int[][] distance;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        map[x][y] = 1;
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    distance[nx][ny] = distance[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Inflearn811 inf = new Inflearn811();
        Scanner scn = new Scanner(System.in);
        map = new int[8][8];
        distance = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                map[i][j] = scn.nextInt();
            }
        }

        inf.BFS(1, 1);
        if (distance[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(distance[7][7]);
        }

    }
}
