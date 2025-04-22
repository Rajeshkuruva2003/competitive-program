class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            return head;
        }
        Node front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
          
       return prev;
       
    }
}