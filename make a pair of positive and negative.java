import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                for(int j=0;j<n;j++){
                    if(arr[i]==-arr[j]){
                        System.out.print(arr[i]+ " "+arr[j]);

                    }
                }
            }
        }
    }
}