import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

class Main {
    public static void main(String[] args) {
        int arr[] = {1,1,1, 2, 3,3,3, 4, 9};
        Node head = currentLL(arr);
        head=deleteDuplicate(head);
        printLL(head);

      
    }

    public static Node currentLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" <-> ");
            }
        }
        System.out.print(" -> NULL\n");
    }
    public static Node findTail(Node head){
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        return tail;
    }
    public static Node deleteDuplicate(Node head){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            Node newNode=temp.next;
            while(temp.data==newNode.data){
                newNode=newNode.next;
            }
            
                temp.next=newNode;
                if(newNode!=null){
                    newNode.back=temp;
                }
                temp=temp.next;
            
        }
        return head;
    }

   
}
