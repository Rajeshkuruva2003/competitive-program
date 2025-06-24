import java.util.*;
class Main{
    public static void recur(int i,int sum,int[] arr,int n,ArrayList<Integer> sumsub){
        if(i==n){
            sumsub.add(sum);
            return;
        }
        recur(i+1,sum+arr[i],arr,n,sumsub);
        recur(i+1,sum,arr,n,sumsub);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> sumsub=new ArrayList<>();
        recur(0,0,arr,n,sumsub);
        Collections.sort(sumsub);
        System.out.println(sumsub);
    }
}