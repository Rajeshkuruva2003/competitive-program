import java.util.*;

class MyStack {
    private Queue<Integer> queue;  // Declare queue as a class-level variable

    // Constructor
    public MyStack() {
        queue = new ArrayDeque<>();  // Initialize queue here
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        if (queue.isEmpty()) throw new RuntimeException("Stack is empty");
        return queue.remove();
    }

    public int top() {
        if (queue.isEmpty()) throw new RuntimeException("Stack is empty");
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
class Main{

    // Main method to test
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            stack.push(value);
        }
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.top());

    }
}
