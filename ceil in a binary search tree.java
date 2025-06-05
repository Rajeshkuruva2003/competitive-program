class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNoe(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Solution{
    public static int findCeil(TreeNode<Integer> root,int key){
        int ceil=-1;
        while(root!=null){
            if(root.data==key){
                ceil=root.data;
                return ceil;
            }
            if(key>root.data){
                root=root.right;
            }
            else{
                ceil=root.data;
                root=root.left;
            }
        }
        return ceil;
    }

            
}