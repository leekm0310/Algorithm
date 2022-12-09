import java.util.Scanner;

public class Inflearn813 {
    static int island =0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n;

    public void DFS(int x, int y, int[][] map) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
                map[nx][ny] = 0;
                DFS(nx, ny, map);
            }
        }
    }
    public void solution(int[][] map) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    island++;
                    map[i][j] = 0;
                    DFS(i, j, map);
                }
            }
        }
    }


    public static void main(String[] args) {
        Inflearn813 m = new Inflearn813();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scn.nextInt();
            }
        }
        m.solution(map);
        System.out.println(island);
    }
}
