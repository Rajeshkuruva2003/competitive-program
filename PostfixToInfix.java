import java.util.*;
class PostfixToInfix{
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter postfix expression:");
        String s=sc.nextLine();
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));  // Push operand as a string
            } 
            else { // operator
                String op1 = st.pop();  // Right operand
                String op2 = st.pop();  // Left operand
                String expr = "(" + op2 + ch + op1 + ")";
                st.push(expr);
            }
        }
        
        System.out.print(st.peek());
        
        
    }
}
tc:O(n)
sc:O(n)