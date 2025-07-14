class Solution {
    public void dfs(int row, int col, int[][] vis, char[][] board, int[] drow, int[] dcol) {
        int n = board.length;
        int m = board[0].length;
        vis[row][col] = 1;

        for (int i = 0; i < 4; i++) {
            int nr = row + drow[i];
            int nc = col + dcol[i];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m &&
                vis[nr][nc] == 0 && board[nr][nc] == 'O') {
                dfs(nr, nc, vis, board, drow, dcol);
            }
        }
    }

    public void solve(char[][] board) {
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        int n = board.length;
        int m = board[0].length;

        int[][] vis = new int[n][m];

        // Step 1: Mark all 'O's connected to the border using DFS
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O' && vis[0][j] == 0) {
                dfs(0, j, vis, board, drow, dcol);
            }
            if (board[n - 1][j] == 'O' && vis[n - 1][j] == 0) {
                dfs(n - 1, j, vis, board, drow, dcol);
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && vis[i][0] == 0) {
                dfs(i, 0, vis, board, drow, dcol);
            }
            if (board[i][m - 1] == 'O' && vis[i][m - 1] == 0) {
                dfs(i, m - 1, vis, board, drow, dcol);
            }
        }

        // Step 2: Replace all unvisited 'O's with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && vis[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
