import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }
        int m=sc.nextInt();
      
        int temp=0;
       
        if(m>=0 && m<n) {
            
            temp=arr[0];
            arr[0]=arr[m];
            arr[m]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
    }
}
