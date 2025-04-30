class Solution {
    
    // Find the k-th node from the current node
    public static ListNode findKNode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    // Reverse a linked list and return the new head
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevTail = null;
        ListNode newHead = null;

        while (temp != null) {
            ListNode kNode = findKNode(temp, k);
            if (kNode == null) {
                if (prevTail != null) {
                    prevTail.next = temp;
                }
                break;
            }

            ListNode nextGroup = kNode.next;
            kNode.next = null;

            // Reverse the current k-group
            ListNode reversedHead = reverseList(temp);

            if (newHead == null) {
                newHead = reversedHead;
            }

            if (prevTail != null) {
                prevTail.next = reversedHead;
            }

            prevTail = temp;
            temp = nextGroup;
        }

        return newHead != null ? newHead : head;
    }
}
