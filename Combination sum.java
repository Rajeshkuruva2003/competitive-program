class Solution {
    private void recur(int i, int can[], int target, List<List<Integer>> ans, List<Integer> ls) {
        if (i == can.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        
        if (can[i] <= target) {
            ls.add(can[i]);
            recur(i, can, target - can[i], ans, ls);  // Pick current
            ls.remove(ls.size() - 1);                 // Backtrack correctly
        }
        
        recur(i + 1, can, target, ans, ls);           // Don't pick current
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        recur(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}
