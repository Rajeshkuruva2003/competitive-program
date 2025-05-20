import java.util.*;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    int size = 0;
    Node top = null;

    void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size++;
    }
    void pop(){
        if(top==null){
            System.out.println("underflow");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
        size--;
       
    
    }
    int peek(){
        if(top==null){
            System.out.println("empty");
             return -1;
        }
        else{
            System.out.println("top:"+ top.data);
        }
        return top.data;
    }
    int getSize(){
        return size;
    }
    
    void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
           
        }
        System.out.print("Stack elements: ");
        Node temp = top;
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

// Main class
public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            st.push(value);
        }

        st.printStack();
        st.pop();
        st.printStack();
        st.peek();
        System.out.println("Current stack size: " + st.getSize());
       
        sc.close();
    }
}
