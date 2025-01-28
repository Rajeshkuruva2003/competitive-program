class Solution {
    int dirs[][] = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    private int solve(boolean[][] vis, int i, int j, int r, int c, int[][] grid) {
        vis[i][j] = true;
        int sum = grid[i][j];
        for(int dir[]: dirs) {
            int nr = i + dir[0], nc = j + dir[1];
            if(nr<0 || nc<0 || nr==r || nc==c || grid[nr][nc]==0 || vis[nr][nc]) continue;
            sum += solve(vis, nr, nc, r, c, grid);
        }
        return sum;
    }

    public int findMaxFish(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        boolean vis[][] = new boolean[r][c];
        int ans = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(grid[i][j] > 0 && !vis[i][j]) {
                    ans = Math.max(ans, solve(vis, i, j, r, c, grid));
                }
            }
        }
        return ans;
    }
}