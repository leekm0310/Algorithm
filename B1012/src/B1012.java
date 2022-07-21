import java.util.Scanner;

public class B1012 {
    static int width;
    static int height;
    static int total;
    static int[][] field;
    static boolean[][] visited;

    static int[] upDown = {-1, 1, 0, 0};
    static int[] rightLeft = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcase = scn.nextInt();

        for (int i = 1; i <= testcase; i++) {
            width = scn.nextInt();
            height = scn.nextInt();
            total = scn.nextInt();

            field = new int[width][height];
            visited = new boolean[width][height];

            for (int j = 0; j < total; j++){
                int x = scn.nextInt();
                int y = scn.nextInt();
                field[x][y] = 1;
            }

            int count = 0;

            for (int k = 0; k < width; k++){
                for (int l = 0; l < height; l++){
                    if (field[k][l] == 1 && !visited[k][l]){
                        dfs(k,l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int a, int b) {
        visited[a][b] = true;
        for (int i = 0; i < 4; i++){
            int na = a + upDown[i];
            int nb = b + rightLeft[i];

            if (na >= 0 && nb >= 0 && na <width && nb < height) {
                if (field[na][nb] == 1 && !visited[na][nb]) {
                    dfs(na,nb);
                }
            }
        }
    }
}

