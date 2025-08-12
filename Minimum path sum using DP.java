class Solution {
    public static int fun(int i, int j, int m, int n, int[][] grid, int[][] dp) {
        if (i >= m || j >= n) return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1) return grid[i][j];
        if (dp[i][j] != -1) return dp[i][j];

        int down = fun(i + 1, j, m, n, grid, dp);
        int right = fun(i, j + 1, m, n, grid, dp);

        return dp[i][j] = grid[i][j] + Math.min(down, right);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return fun(0, 0, m, n, grid, dp);
    }
}
                                             Tabulation
class Solution {
        

    public int minPathSum(int[][] grid) {
        int sum=0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        
        for(int i=0;i<m;i++){
           
            for(int j=0;j<n;j++){
                if(i==0 && j==0) dp[i][j]=grid[0][0];
                else if(i==0) {
                        dp[i][j] = grid[i][j]+dp[i][j-1];
                }
                else if(j==0) {
                        dp[i][j] = grid[i][j]+dp[i-1][j];
                }
                else{
                        int down = grid[i][j]+dp[i-1][j];
                        int right = grid[i][j]+dp[i][j-1];
                        dp[i][j] = Math.min(down,right);
                }
            }
        }
        return dp[m-1][n-1];

        
               
    }
        
}
