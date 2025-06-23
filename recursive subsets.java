import java.util.*;
class Main{
    public static void recur(int i,int[] arr,int n,List<Integer> ls){
        if(i>=n){
            System.out.println(ls);
            return;
        }
        ls.add(arr[i]);
        recur(i+1,arr,n,ls);
        ls.remove(ls.size()-1);
        recur(i+1,arr,n,ls);

        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        recur(0,arr,n,new ArrayList<>());
    }
}
tc:O(2^n)