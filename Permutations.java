import java.util.*;
public class Permutatons {
	public static void swap(char[] arr,int k,int i) {
		char h=arr[i];
		arr[i]=arr[k];
		arr[k]=h;
	}
	public static void fun(char[] arr,int n,int k) {
		if(k==n-1) {
			System.out.println(new String(arr));
			return;
		}
		for(int i=k;i<n;i++) {
			swap(arr,k,i);
			fun(arr,n,k+1);
			swap(arr,k,i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		char ch[]=s.toCharArray();
		int n=s.length();
		fun(ch,n,0);

	}

}
