/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int lh = getHeightLeft(root);
        int rh = getHeightRight(root);

        if (lh == rh) {
            return (int)Math.pow(2, lh) - 1;  // Perfect binary tree
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    public int getHeightLeft(TreeNode root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.left;
        }
        return height;
    }

    public int getHeightRight(TreeNode root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.right;
        }
        return height;
    }
}
tc:O(log(n)^2)