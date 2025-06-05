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
        int floor=-1;
        while(root!=null){
            if(root.data==key){
                floor=root.data;
                return floor;
            }
            if(key>root.data){
                 floor=root.data;
                root=root.right;
                
            }
            else{
                
                root=root.left;
            }
        }
        return ceil;
    }

            
}