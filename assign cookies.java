class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m=s.length-1;
        int l=0;
        int r=0;
        int ans=0;
        while(l<m){
            if(g[l]<=s[m]){
                
                r=r+1;
                
            }
            
            
            l=l+1;
        }
         
        return r;
    }
}
tc:O(nlogn+mlogm+m)
sc:O(1)