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
        int arr[] = {1, 2, 3, 4, 9};
        Node head = currentLL(arr);

        printLL(head);

        int ele = 5;
        List<Integer> addedElements = pairSum(head, ele);
        for (int val : addedElements) {
            System.out.print(val + " ");
        }
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

    public static List<Integer> pairSum(Node head, int ele) {
        List<Integer> arr = new ArrayList<>();
        Node temp1 = head;

        while (temp1 != null) {
            Node temp2 = temp1.next;
            while (temp2 != null) {
                if (temp1.data + temp2.data == ele) {
                    arr.add(temp1.data);
                    arr.add(temp2.data);
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }

        return arr;
    }
}
///////////////////////////////////////////////////////
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
        int arr[] = {1, 2, 3, 4, 9};
        Node head = currentLL(arr);

        printLL(head);

        int ele = 5;
        List<int[]> addedElements = pairSum(head, ele);
        for (int[] pair : addedElements) {
            System.out.print(pair[0] + " " +pair[1]);
        }
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

    public static List<int[]> pairSum(Node head, int ele) {
    List<int[]> pairs = new ArrayList<>();
    Node left = head;
    Node right = findTail(head);

    while (left.data<right.data) {
        int sum = left.data + right.data;

        if (sum == ele) {
            pairs.add(new int[]{left.data, right.data});
            left = left.next;
            right = right.back;
        } else if (sum < ele) {
            left = left.next;
        } else {
            right = right.back;
        }
    }

    return pairs;

    }
}
