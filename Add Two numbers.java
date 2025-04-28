class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);  // use ListNode, not Node
        ListNode current = dummy;
        int carry = 0;
        
        while (t1 != null || t2 != null) {  // use OR (||), not AND (&&)
            int sum = carry;
            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }
            ListNode newNode = new ListNode(sum % 10);  // use ListNode
            carry = sum / 10;
            current.next = newNode;
            current = current.next;
        }
        
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            current.next = temp;  // fix carry node attachment
        }
        
        return dummy.next;
    }
}
