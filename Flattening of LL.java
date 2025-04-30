class Solution {
    // Merge two sorted linked lists using 'child' pointers
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                res.child = l1;
                l1 = l1.child;
            } else {
                res.child = l2;
                l2 = l2.child;
            }
            res = res.child;
        }

        if (l1 != null) {
            res.child = l1;
        } else {
            res.child = l2;
        }

        return dummy.child;
    }

    // Flatten multilevel linked list into a single sorted list
    public ListNode flattenLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode flattenedNext = flattenLinkedList(head.next);
        head.next = null; // disconnect the 'next' link
        return merge(head, flattenedNext);
    }
}
