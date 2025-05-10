import java.util.*;
class Main{
    
    public static void main(String[] args){
        int n=780;
        double s=Math.sqrt(n);
         List<Integer> ls=new ArrayList<>();
        for(int i=2;i<s;i++){
           
            if(n%i==0){
                ls.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
            
            
        }
        if(n!=1){
            ls.add(n);
        }
        

        System.out.println(ls);
    }
}
Tc->O(sqrt(n)+log n)
Sc->o()