class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

     
        return buildTree(inorder, 0, inorder.length - 1,
                         postorder, 0, postorder.length - 1,
                         map);
    }

    private TreeNode buildTree(int[] inorder, int instart, int inend,
                               int[] postorder, int poststart, int postend,
                               HashMap<Integer, Integer> map) {
        if (poststart > postend || instart > inend) {
            return null;
        }

       
        TreeNode root = new TreeNode(postorder[postend]);

      
        int inroot = map.get(root.val);
        int numsLeft = inroot - instart;

     
        root.left = buildTree(inorder, instart, inroot - 1,
                              postorder, poststart, poststart + numsLeft - 1,
                              map);

       
        root.right = buildTree(inorder, inroot + 1, inend,postorder, poststart + numsLeft, postend - 1,map);

        return root;
    }
}
