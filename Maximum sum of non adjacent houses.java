class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; 

        int dp[] = new int[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i > 1) {
                pick += dp[i - 2]; 
            }
            int notPick = dp[i - 1];        
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
    }
}

TC:O(n)
sc:O(n)
                          two variables
  class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int pre=nums[0];
        int pre1=0;
        int cur=0;
        if (n == 1) return nums[0]; 

       

        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i > 1) {
                pick += pre1; 
            }
            int notPick =pre;        
             cur= Math.max(pick, notPick);
             pre1=pre;
             pre=cur;
        }

        return cur;
    }
}
tc:O(n)
sc:O(1)                        