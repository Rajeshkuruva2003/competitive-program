class Solution {
    
    public int jump(int[] nums) {
        int l=0;
        int r=0;
        int jump=0;
        
        while(r<nums.length-1){
            int farthest=0;
            for(int i=0;i<=r;i++){
                farthest=Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            r=farthest;
            jump+=1;      
            
           
        }
        return jump;
    }
}
tc:O(n)
sc:O(1)