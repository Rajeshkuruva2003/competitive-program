/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Clone nodes and insert them after original nodes
        Node temp = head;
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }

        // Step 2: Assign random pointers
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // Step 3: Separate the original and copied list
        Node dummy = new Node(-1);
        Node copyCurrent = dummy;
        temp = head;
        while (temp != null) {
            copyCurrent.next = temp.next;
            temp.next = temp.next.next;

            copyCurrent = copyCurrent.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}
