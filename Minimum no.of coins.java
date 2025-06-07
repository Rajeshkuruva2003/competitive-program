// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        int coins[]={1,2,5,10,20,50,100,200,500,2000};
        List<Integer> res=new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            while(N>=coins[i]){
                N-=coins[i];
                res.add(coins[i]);
                
                
            }
            
            
        }
        return res;
        
        
    }
}
tc:O(N)
sc:O(1)