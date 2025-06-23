import java.util.*;
class Main{
    public static int recur(int i,int k,int[] arr,int n,int s){
        if(i>=n){
            if(s==k){
                return 1;
              
            }
            return 0;
            
           
        }
        
        s+=arr[i];
        int l=recur(i+1,k,arr,n,s);
        
        
        s-=arr[i];
        int r=recur(i+1,k,arr,n,s);
        return l+r;   
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ls=new ArrayList<>();
        System.out.println(recur(0,k,arr,n,0));
    }
}