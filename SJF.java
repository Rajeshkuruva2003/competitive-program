import java.util.*;
class Main{
    
    public static void SJF(int arr[],int n){
        Arrays.sort(arr);
        int wtime=0;
        int t=0;
        for(int i=0;i<n;i++){
            wtime+=t;
            t+=arr[i];
        }
        System.out.println("wtime:" + wtime/n);
            
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SJF(arr,n);
    }
}
tc:O(n+nlogn)
sc:O(1)