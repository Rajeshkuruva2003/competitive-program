import java.util.*;

public class InfixToPrefix {

    // Method to define operator precedence
    public static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return 0;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String s = sc.nextLine();

        // Step 1: Reverse the infix expression and swap '(' with ')'
        StringBuilder reversed = new StringBuilder(s).reverse();
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (ch == '(') reversed.setCharAt(i, ')');
            else if (ch == ')') reversed.setCharAt(i, '(');
        }

        // Step 2: Apply infix-to-postfix logic
        String expr = reversed.toString();
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // remove '('
            } 
            else {
               if(ch=='^'){
                   while(!stack.isEmpty() && priority(ch)<=priority(stack.peek())){
                       ans.append(stack.pop());
                    }
                    stack.push(ch);
                } else {
                    while (!stack.isEmpty() && priority(ch) <priority(stack.peek())) {
                        ans.append(stack.pop());
                   }
                   stack.push(ch);
               }
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        // Step 3: Reverse the postfix result to get prefix
        String prefix = ans.reverse().toString();

        System.out.println("Prefix expression: " + prefix);
    }
}
