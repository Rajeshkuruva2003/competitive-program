class Solution {
    public static ListNode findNthNode(ListNode temp, int k){
        int cnt = 1;
        while (temp != null) {
            if (cnt == k) {
                return temp;
            }
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length of the list
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        // Step 2: Normalize k
        k = k % len;
        if (k == 0) return head;

        // Step 3: Find (len - k)th node from head
        ListNode newTail = findNthNode(head, len - k);

        // Step 4: Rotate
        ListNode newHead = newTail.next;
        newTail.next = null;
        temp.next = head;  // make it circular and then break

        return newHead;
    }
}
