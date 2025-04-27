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
        int arr[] = {1,5,9};
        Node head = constructLL(arr);
        head=addOne(head);
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
    public static Node addOne(Node head) {
        int carry = addHelper(head);
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    public static int addHelper(Node temp) {
        if (temp == null) {
            return 1;
        }
        int carry = addHelper(temp.next);
        temp.data += carry;
        if (temp.data < 10) {
            return 0;
        }
        temp.data = 0;
        return 1;
    }
}
