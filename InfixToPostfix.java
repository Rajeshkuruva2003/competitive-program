import java.util.*;

public class InfixToPostfix {

    // Method to define operator precedence
    public static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch=='^') return 3;
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String s = sc.nextLine();  

        String ans = "";
        Stack<Character> st = new Stack<>();
        int n = s.length();

        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                ans += ch;
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();  // Remove the '('
                }
            }
            else { // Operator
                while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                    ans += st.pop();
                }
                st.push(ch);
            }
            i++;
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        System.out.println("Postfix expression: " + ans);
    }
}
