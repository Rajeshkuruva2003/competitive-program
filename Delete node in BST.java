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
    public TreeNode deleteNode(TreeNode root, int key) {
         if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);  // go left
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // go right
        } else {
            // Node found
            if (root.left == null) return root.right; // one or no child
            if (root.right == null) return root.left;

            // Node has two children
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        }

        return root;
    }

    public TreeNode findMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }
}