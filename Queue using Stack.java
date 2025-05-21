import java.util.*;

class MyQueue {
    Deque<Integer> s1;
    Deque<Integer> s2;

    public MyQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    // Enqueue operation
    void push(int x) {
        s1.push(x);
    }

    // Dequeue operation
    int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) throw new RuntimeException("Queue is empty");
        return s2.pop();
    }

    // Peek the front element
    int top() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) throw new RuntimeException("Queue is empty");
        return s2.peek();
    }

    // Check if queue is empty
    boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of elements to push
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            q.push(value);
        }

        System.out.println("Front (top): " + q.top());   // Expected: 1
        System.out.println("Popped: " + q.pop());        // Expected: 1
        System.out.println("Now front: " + q.top());     // Expected: 2
    }
}
