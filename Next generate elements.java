import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int arr[]=new int[n];
        int ans[]=new int[n];
          for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
                
            }if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.pop();
            }
            st.push(arr[i]);
        }
        for(int val:ans){
            System.out.println(val);
        }
        
        
    }
}