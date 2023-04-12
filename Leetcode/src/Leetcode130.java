public class Leetcode130 {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < cols; i++) {
            if(board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            if (board[rows - 1][i] == 'O') {
                dfs(board, rows - 1, i);
            }
        }

        for (int j = 0; j < rows; j++) {
            if (board[j][0] == 'O') {
                dfs(board, j, 0);
            }
            if (board[j][cols - 1] == 'O') {
                dfs(board, j, cols - 1);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y) {
        int rows = board.length;
        int cols = board[0].length;
        if (x >= 0 && y >= 0 && x < rows && y < cols && board[x][y] == 'O') {
            board[x][y] = 'T';
            dfs(board, x + 1, y);
            dfs(board, x - 1, y);
            dfs(board, x, y + 1);
            dfs(board, x, y - 1);
        }
    }
}
