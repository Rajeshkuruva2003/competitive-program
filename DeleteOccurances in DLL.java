class Node {
    int data;
    Node next;
    Node back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back=null;
    }
    Node(int data, Node next,Node back) {
        this.data = data;
        this.next = next;
        this.back=back;
    }
}
class Main{
    public static void main(String[] args){
        int arr[]={2,3,3,4,3,3,4};
        Node head=currentLL(arr);
       head=deleteKey(head,3);
        
        printDoublyLL(head);
        
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
    public static void printDoublyLL(Node head) {
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
    public static Node deleteKey(Node head,int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
               if(temp==head){
                   head=head.next;
               }
               Node newNode=temp.next;
               Node prevNode=temp.back;
               if(newNode!=null){
                   newNode.back=prevNode;
                   
               }
               if(prevNode!=null){
                   prevNode.next=newNode;
               }
               temp=newNode;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}