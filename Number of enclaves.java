class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int nrow[]={-1,0,1,0};
        int ncol[]={0,1,0,-1};
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0||i==n-1||j==m-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
            for(int i=0;i<4;i++){
                int nro=r+nrow[i];
                int nco=c+ncol[i];
                if(nro>=0&&nro<n && nco>=0&&nco<m && vis[nro][nco]==0 && grid[nro][nco]==1){
                    q.add(new Pair(nro,nco));
                    vis[nro][nco]=1;

                }
            }

        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}