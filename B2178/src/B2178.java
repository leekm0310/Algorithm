import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B2178 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;

    static int[] upDown = {1, -1, 0, 0};
    static int[] leftRight = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < m; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);
        System.out.println(map[n-1][m-1]);
    }

    public static void bfs(int a, int b) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {a, b});

        while(!queue.isEmpty()){
            int now[] = queue.poll();
            visited[a][b] = true;

            for (int i = 0; i < 4; i++) {
                int nextX = now[0] + upDown[i];
                int nextY = now[1] + leftRight[i];

                if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
                    if (map[nextX][nextY] != 0 && !visited[nextX][nextY]) {
                        queue.offer(new int[] {nextX, nextY});
                        visited[nextX][nextY] = true;
                        map[nextX][nextY] = map[now[0]][now[1]] + 1;
                    }
                }
            }
        }
    }
}

