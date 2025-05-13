import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int arr[]={2,3,4,5,6};
	   int n=arr.length;
	   int window=3;
	   int temp=0;
	   int ans=0;
	   int l=0;
	   for(int r=0;r<n;r++){
	       temp+=arr[r];
	       if(r-l==window){
	           temp-=arr[l];
	           l++;
	       }
	       if(r-l+1==window){
	           ans=Math.max(ans,temp);
	       }
	   }
	   System.out.println(ans);
	       
	   
	}
}