 
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

class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        Node head = constructLL(arr);
        head=deleteHead(head);
        head=removeTail(head);
        head=removeK(head,2);
        head=removeEle(head,5);
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
     
    public static Node deleteHead(Node head){
        if(head==null){
            return head;
        }
        
        head=head.next;
        return head;
    }
    public static Node removeTail(Node head){
        if(head==null|| head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
            
        }
        temp.next=null;
        return head;
    }
    public static Node removeK(Node head, int ele) {
    if (head == null) {
        return null;
    }

    // Case: Remove the first node
    if (ele == 1) {
        return head.next;
    }

    Node temp = head;
    int cnt = 1;

    // Traverse to the node just before the one we want to remove
    while (temp != null && cnt < ele - 1) {
        temp = temp.next;
        cnt++;
    }

    // Check if the next node exists (node to be deleted)
    if (temp == null || temp.next == null) {
        // Position is greater than the number of nodes
        return head;
    }

    // Remove the node
    temp.next = temp.next.next;

    return head;
}
 public static Node removeEle(Node head, int ele) {
    if (head == null) {
        return null;
    }

    // Case 1: Head contains the value
    if (head.data == ele) {
        return head.next;
    }

    Node temp = head;
    Node prev = null;

    // Traverse the list
    while (temp != null) {
        if (temp.data == ele) {
            // Element found – remove it
            prev.next = temp.next;
            break;
        }
        prev = temp;
        temp = temp.next;
    }

    return head;
}


}