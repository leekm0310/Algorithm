import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, answer = 0, temp = 0;
    static int[][] map;
    static int[][] visit;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void DFS(int idx, int jdx) {
        if (answer < temp) {
            answer = temp;
        }
        for (int i = 0; i < 4; i++) {
            int nx = jdx + dx[i];
            int ny = jdx + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m || visit[nx][ny]==1||
            map[nx][ny]==0){
                continue;
            }
            temp++;
            visit[nx][ny] = 1;
            DFS(nx,ny);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new int[n][m];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int picCnt =0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (visit[i][j] == 0 && map[i][j] ==1){
                    visit[i][j] = 1;
                    temp = 1;
                    DFS(i,j);
                    picCnt++;
                }
            }
        }
        System.out.println("개수"+picCnt);
        System.out.println("넓이"+answer);

    }
}
