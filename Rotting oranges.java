class Pair {
    int row;
    int col;
    int tm;
    Pair(int row, int col, int tm) {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        int cntFresh = 0;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                }
                if(grid[i][j] == 1) {
                    cntFresh++;
                }
            }
        }

        int tm = 0;
        int cnt = 0;

        while(!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int t = p.tm;
            tm = Math.max(tm, t);

            for(int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m 
                   && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol, t + 1));
                    grid[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }

        return (cnt == cntFresh) ? tm : -1;
    }
}
