class Solution {
    public int climbStairs(int n) {
        int first=1;
        int second=1;
        int cur=0;
        if(n==1) return 1;
        for(int i=2;i<=n;i++){
            cur=first+second;
            first=second;
            second=cur;
        }
        return cur;
       

    }
}
TC:O(n)
SC:O(1)