class Pair {
    int row;
    int col;
    int dist;

    Pair(int row, int col, int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};

        int n = mat.length;
        int m = mat[0].length;
        int[][] dist = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int step = p.dist;

            dist[r][c] = step;

            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol]) {
                    vis[nrow][ncol] = true;
                    q.add(new Pair(nrow, ncol, step + 1));
                }
            }
        }

        return dist;
    }
}
