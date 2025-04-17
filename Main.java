class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Main {
     public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        Node head = constructLL(arr);
        head=insertAtHead(head,9);
        head=insertAtEnd(head, 55);
        head=insertK(head,45,3);
        head=insertBefore(head,5,78);
        printLL(head);
    }
public static Node constructLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
   

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.print("->NULL\n");
    }
     public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    public static Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null){
            return new Node(x);
        }
        Node temp=head;
       
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(x);
        temp.next=newNode;
        return head;
        
    }
    public static Node insertK(Node head, int data,int position){
        Node newNode = new Node(data);
      
      
      if (position == 1) {
          newNode.next = head;
          return newNode;
      }

      Node temp = head;
      int count = 1;
      while (temp != null && count < position - 1) {
          temp = temp.next;
          count++;
      }

      if (temp == null) {
          System.out.println("Position is out of bounds.");
          return head;
      }

      newNode.next = temp.next;
      temp.next = newNode;
      return head;
    }
    public static Node insertBefore(Node head, int el, int val) {
        if (head == null) {
            return null;
        }
    
        if (head.data == val) {
           return new Node (el,head);
        }
    
        Node temp = head;
    
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
    
        return head;
    }
    
    

}
  