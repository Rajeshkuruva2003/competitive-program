                                   Next greater element towards left
import java.util.*;
class Main{
   
    public static void main(String[] args){
        int arr[]={9,8,13,4,40,6};
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
            
        }
        System.out.println(Arrays.toString(res));
        
        
    }
}
                       Next smaller element towards left
import java.util.*;
class Main{
   
    public static void main(String[] args){
        int arr[]={9,8,13,4,40,6};
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
            
        }
        System.out.println(Arrays.toString(res));
        
        
    }
}
tc:O(n)
sc:O(n)