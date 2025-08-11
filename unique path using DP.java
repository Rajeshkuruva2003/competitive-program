class Solution {
    public   int fun(int i,int j,int m,int n,int dp[][]){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m-1 || j>n-1){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int down=fun(i+1,j,m,n,dp);
        int right=fun(i,j+1,m,n,dp);
        return dp[i][j]=down+right;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row,-1);
        }
        return fun(0,0,m,n,dp);
    }
}
                             Tabulation
    class Solution {
   
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }

        }
       
        return dp[m-1][n-1];
    
    }
}
Tc:O(m*n)
sc:O(m*n)                         