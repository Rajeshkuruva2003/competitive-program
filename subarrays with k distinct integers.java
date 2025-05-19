class Solution {
    public int atMost(int nums[],int k){
        int l=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int r=0;r<n;r++ ){
            int val=nums[r];
           hm.put(val,hm.getOrDefault(val,0)+1);
        
            while(hm.size()>k)
            {
               int lval=nums[l];
                hm.put(lval,hm.get(lval)-1);
                if(hm.get(lval)==0){
                   hm.remove(lval);
                }
                 l++; 
           
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
}