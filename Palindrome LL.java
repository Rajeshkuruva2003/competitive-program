class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null|| head.next==null){
            return head;
        }
       ListNode newNode=reverseList(head.next);
       ListNode front=head.next;
       front.next=head;
       head.next=null;
       return newNode;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newNode =reverseList(slow.next);
        ListNode first=head;
        ListNode second=newNode;
        while(second!=null){
            if(first.val!=second.val){
                reverseList(newNode);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseList(newNode);
        return true;
    }
}