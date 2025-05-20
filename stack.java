import java.util.*;

class StackExample {
    int capacity = 10;
    int top = -1;
    int[] stack = new int[capacity];

    void push(int n) {
        if (top >= capacity - 1) {
            System.out.println("Overflow");
            return;
        }
        stack[++top] = n;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow: Stack is empty.");
            
        }
        System.out.println("Popped element: " + stack[top]);
        top--;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;  // Indicates empty
        } else {
            System.out.println("Top element: " + stack[top]);
            return stack[top];
        }
    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackExample s = new StackExample();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements to push (max 10):");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();
            s.push(value);
        }

       

        System.out.println("Do you want to pop another element? (yes/no):");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("yes")) {
            s.pop();
            s.printStack();  // Print one pop
        }
         s.peek();       // Show top element
            
        // Print after popping

        sc.close();
    }
}
