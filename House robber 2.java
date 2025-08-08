class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        int case1 = robLinear(nums, 0, n - 2);
        int case2 = robLinear(nums, 1, n - 1);
        
        return Math.max(case1, case2);
    }

    private int robLinear(int[] nums, int start, int end) {
        int pre = nums[start];
        int pre1 = 0;
        int cur = pre;

        for (int i = start + 1; i <= end; i++) {
            int pick = nums[i] + pre1;
            int notPick = pre;
            cur = Math.max(pick, notPick);

            pre1 = pre;
            pre = cur;
        }
        return cur;
    }
}
