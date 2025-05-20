import java.util.*;

class CircularQueue {
    int cap = 3;
    int[] queue = new int[cap];
    int start = -1;
    int end = -1;
    int cur = 0;

    void push(int x) {
        if (cur == cap) {
            System.out.println("Queue is full.");
            return;
        }

        if (cur == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % cap;
        }

        queue[end] = x;
        cur++;
    }
    int pop() {
        if (cur == 0) {
            System.out.println("Queue is empty.");
            return -1; // or throw an exception
        }
    
        int s = queue[start];
        if (cur == 1) {
            start = end = -1;
        } else {
            start = (start + 1) % cap;
        }
        cur--;
        return s;
    }
    int top(){
        if(cur==0){
            System.out.println("empty");
            return -1;
        }
        return queue[start];
    }
    int getSize(){
        return cur;
    }


    void printQueue() {
        if (cur == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < cur; i++) {
            int index = (start + i) % cap;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to enqueue (max 10): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();
            q.push(value);
        }

        q.printQueue();
        q.pop();
        System.out.println("Queue elements after popping:");
        q.printQueue();
        
        System.out.println("Top: " + q.top());
        
        System.out.println("queue size:"+ q.getSize());

    }
}
