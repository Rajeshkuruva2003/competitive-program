class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int temp=0;
        int l=0;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            temp=fruits[i];
                hm.put(temp,hm.getOrDefault(temp,0)+1);
        
           while(hm.size()>2){
              int val=fruits[l];
              hm.put(val,hm.get(val)-1);
              if(hm.get(val)==0){
                hm.remove(val);
            }
            l++;
           }  
           ans=Math.max(ans,i-l+1);   
            }
       return ans;
    }
}