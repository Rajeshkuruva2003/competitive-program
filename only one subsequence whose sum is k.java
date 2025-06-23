import java.util.*;
class Main{
    public static boolean recur(int i,int k,int[] arr,int n,List<Integer> ls,int s){
        if(i>=n){
            if(s==k){
                System.out.println(ls);
               return true;
            }
            else{
                return false;
            }
           
        }
        ls.add(arr[i]);
        s+=arr[i];
        if(recur(i+1,k,arr,n,ls,s)==true){
            return true;
        }
        ls.remove(ls.size()-1);
        s-=arr[i];
        if(recur(i+1,k,arr,n,ls,s)==true){
            return true;
        }
        return false;

        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    
        recur(0,k,arr,n,new ArrayList<>(),0);
    }
}