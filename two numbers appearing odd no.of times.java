import java.util.*;
class Main{
    
    public static void main(String[] args){
        int arr[]={4,2,4,5,1,5};
        int n=arr.length;
        /*HashMap<Integer,Integer> hm=new HashMap<>();
       for(int key:arr){
          
           hm.put(key,hm.getOrDefault(key,0)+1);
       }
       for (Integer key : hm.keySet()) {
            if (hm.get(key) == 1) {
                System.out.println(key);
            }
        }*/
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        int right=xor&(xor-1)^xor;
        int b1=0;
        int b2=0;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((arr[i]&right)!=0){
                b1=b1^arr[i];
            }
            else{
                b2=b2^arr[i];
            }
        }
        ls.add(b1);
        ls.add(b2);
        System.out.println(ls);
    }
}