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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        boolean lefttoright=true;
        while(!qu.isEmpty()){
             int qusize=qu.size();
             List<Integer> current=new ArrayList<>();
             for(int i=0;i<qusize;i++){
                    TreeNode node=qu.poll();
                   if(lefttoright){
                    current.addLast(node.val);
                   }
                   else{
                    current.addFirst(node.val);
                   }
                    if(node.left!=null){
                        qu.add(node.left);
                    }
                    if(node.right!=null){
                        qu.add(node.right);
                    }
             }
             lefttoright=!lefttoright;
             ls.add(current);
        }
        return ls;
    }
}