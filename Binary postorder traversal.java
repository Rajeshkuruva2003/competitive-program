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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        postorder(root,ls);
        return ls;
    }
    public void postorder(TreeNode node,List<Integer> ls){
        if( node==null) return ;
        postorder(node.left,ls);
        postorder(node.right,ls);
        ls.add(node.val);
    }
}