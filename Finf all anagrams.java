class Solution {
    public  boolean fun(HashMap<Character,Integer>hma,HashMap<Character,Integer>hmb){
        if(hma.size()!=hmb.size()){
            return false;
        }
        for(char key:hma.keySet()){
            if(!hmb.containsKey(key)){
               return false;
            }
            int a=hma.get(key);
            int b=hmb.get(key);
            if(a!=b){
                return false;
            }
            
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> hms=new HashMap<>();
        HashMap<Character,Integer> hmp=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }
        List<Integer> a=new ArrayList<>();
        int k=p.length();
        int n=s.length();
        int l=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            hms.put(ch,hms.getOrDefault(ch,0)+1);
    
            if(r-l==k){
             char ch1=s.charAt(l);
             hms.put(ch1,hms.get(ch1)-1);
             if(hms.get(ch1)==0){
                hms.remove(ch1);
            }
            l++;
        }
        if(r-l+1==k){
            boolean valid=fun(hms,hmp);
            if(valid){
                a.add(l);
            }

        }

        
    }
    return a;
    }
}