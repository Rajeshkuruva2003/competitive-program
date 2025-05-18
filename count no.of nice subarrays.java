import java.util.*;
class Main{
    public static int atMost(int arr[],int k){
        
        int n=arr.length;
        int l=0;
      
        int temp=0;
        int ans=0;
        int cnt=0;
        for(int r=0;r<n;r++){
            
            if(arr[r]%2==1){
                cnt+=1;
            }
            while(cnt>k){
              if(arr[l]%2==1){
                  cnt--;
              }
              l++;
            }
           
            ans=Math.max(ans,r-l+1);
        }
       return ans;
    }
    public static void main(String[] args){
        int arr[]={12,1,3,1,1,6,7,1,8,1};
        int k=2;
        
        int sum=atMost(arr,k)-atMost(arr,k-1);
        System.out.println(sum);
    }
}