class Solution {
    public int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int sum = 0, l = 0, ans = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum > goal) {
                sum -= nums[l++];
            }

            ans += r - l + 1;
        }
        return ans;
    }

    public int numberOfSubarrays(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}
