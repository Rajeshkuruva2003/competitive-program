import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node start = null;
    Node end = null;
    int size = 0;

    void push(int x) {
        Node temp = new Node(x);
        if (start == null) {
            start = end = temp;
        } else {
            end.next = temp;
            end = temp; // Fix: move end pointer forward
        }
        size++;
    }
    void pop(){
        if(start==null){
            System.out.println("uderflow");
            return;
        }
        System.out.println("Popped: " + start.data);
        start = start.next;
        if (start == null) {
            end = null;
        }
        size--;
    }
    int peek(){
        if(start==null){
            System.out.println("Queue empty");
        }
        return start.data;
    }
    int  getSize(){
        return size;
    }
    void printQueue() {
        if (start == null && end == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println("->NULL");
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();
            q.push(value);
        }
        

        q.printQueue();
        System.out.println("After popping:");
        q.pop();
        System.out.println("peek:"+ q.peek());
       System.out.println("Size:"+ q.getSize());
        sc.close();
    }
}
TC:O(1)