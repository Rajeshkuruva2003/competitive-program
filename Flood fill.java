class Solution {
    public void  dfs(int image[][],int r,int c,int color,int init,int ans[][],int u[],int y[]){
        ans[r][c]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int row=r+u[i];
            int col=c+y[i];
            if(row>=0&&row<n && col>=0&&col<m &&image[row][col]==init && ans[row][col]!=color){
                dfs(image, row, col, color, init, ans, u, y);
            }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int init=image[sr][sc];
        int ans[][]=image;
        int nrow[]={-1,0,1,0};
        int ncol[]={0,1,0,-1};
        dfs(image,sr,sc,color,init,ans,nrow,ncol);
        return ans;
       
    }
}
Tc:O(n*m)