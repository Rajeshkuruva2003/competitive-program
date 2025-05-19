import java.util.*;
class Main{
    public static void main(String[] args){
        HashMap<Character,Integer> hm=new HashMap<>();
        String st="aaabbcbac";
        int n=st.length();
        int l=0;
        int stlen=0;
        int k=2;
        for(int i=0;i<n;i++){
            char ch=st.charAt(i);
            
            hm.put(ch,hm.getOrDefault(ch,0)+1);
                while(hm.size()>k){
                    char lch=st.charAt(l);
                    hm.put(lch,hm.get(lch)-1);
                    if(hm.get(lch)==0){
                        hm.remove(lch);
                    }
                    l++;
                   
                }
                stlen=Math.max(stlen,i-l+1);
                   
                
            
        }
            System.out.println(stlen);
    }
}