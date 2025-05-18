import java.util.*;
class Main{
    public static void main(String[] args){
        int arr[]={2,4,6,3,8};
        int n=arr.length;
        int l=0;
        int k=10;
        int temp=0;
        int ans=0;
        for(int r=0;r<n;r++){
            temp+=arr[r];
            while(temp>k){
                temp=temp-arr[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}