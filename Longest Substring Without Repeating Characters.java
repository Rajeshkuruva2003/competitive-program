class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        HashSet<Character> hs=new HashSet<>();
        int ans=0;
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(!hs.contains(ch)){
                 hs.add(ch);    
            }
            else{
                while(hs.contains(ch)){
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(ch);
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}
////////////////////////////////
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int max=0;
        int[] hash = new int[256];  
        Arrays.fill(hash, -1);      
        int ans=0;
        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            hash[s.charAt(r)]=r;
            max=Math.max(max,r-l+1);
            r++;
           
        }
        return max;
    }
}
 TC:0(N)
 SC:0(256)           
           
         