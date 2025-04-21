class Node{
    int data;
    Node next;
    Node back;
    Node(int data,Node next,Node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
class Main{
    public static void main(String[] args){
        int arr[]={2,3,4,5,6};
        Node head=currentLL(arr);
        /*head=insertHead(head,10);
        head=insertTail(head,11);
        head=insertBeforeTail(head,12);
        head=insertK(head,35,3);
        insertBeforeNode(head.next.next,100);*/
        head=reverseDLL(head);
        printLL(head);
    }
    public static Node currentLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
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
    public static Node reverseDLL(Node head){
        if(head==null && head.next==null){
            return head;
        }
        Node temp=null;
        Node current=head;
        while(current!=null){
            temp=current.back;
            current.back=current.next;
            current.next=temp;
            current=current.back;
        }
        return temp.back;
    }
    
}
