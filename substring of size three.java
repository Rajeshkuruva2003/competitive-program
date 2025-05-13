import java.util.*;

public class Main{
    public static boolean fun(String s,int k){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hs.add(ch);
            
        }
        if(hs.size()==k){
            return true;
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) {
          String s="fkshfgaousyrfalg";
          int k=3;
          int ans=0;
          for(int i=0;i<s.length()-k+1;i++){
             boolean temp=fun(s.substring(i,i+k),k);
             if(temp){
                 ans+=1;
             }
        }
             System.out.println(ans);
	}
}
///////////////////////////
class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int k=3;
        int ans=0;
        int l=0;
        for(int r=0;r<s.length();r++){
           char ch=s.charAt(r);
           hm.put(ch,hm.getOrDefault(ch,0)+1);
           if(r-l==k){
              char tch=s.charAt(l);
              hm.put(tch,hm.get(tch)-1);
              if(hm.get(tch)==0){
                hm.remove(tch);
              }
              l+=1;
            }
           if(hm.size()==k){
               ans+=1;
           }
        }  
           return ans;
    }
}
        
	