import java.util.*;
class PrefixToInfix{
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter prefix expression:");
        String s=sc.nextLine();
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
          
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));  // Push operand as a string
            } 
            else { // operator
                String op1 = st.pop();  // Right operand
                String op2 = st.pop();  // Left operand
                String expr = "(" + op1 + ch + op2 + ")";
                st.push(expr);
            }
        }
       
        
        System.out.print(st.peek());
        
        
    }
}