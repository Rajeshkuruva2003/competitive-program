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
        int arr[]={2,3,4,5,6,7,8};
        Node head=currentLL(arr);
        head=removeHead(head);
        head=removeTail(head);
        head=removeK(head,1);
        removeEle(head.next.next);
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

    public static Node removeHead(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node temp=head;
        head=head.next;
        head.back=null;
        temp.next=null;
    

      return head;
    }
    public static Node removeTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        Node prev=temp.back;
        prev.next=null;
       temp.back=null;
        
    
    return head;
    }
    public static Node removeK(Node head,int ele){
        if(head==null){
            return null;
        }
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==ele){
                break;
            }
            temp=temp.next;
        }
        Node prev=temp.back;
        Node front=temp.next;
        if(prev==null && front==null){
            return null;
            
        }
        else if(prev==null){
            return removeHead(head);
        }
        else if(front==null){
            return removeTail(head);
        }
        prev=temp.next;
        front=temp.back;
        temp.next=null;
        temp.back=null;
        
    
    return head;
    }
    public static Node removeEle(Node head){
        Node temp=head;
        Node prev=temp.back;
        Node front=temp.next;
        if(front==null){
            prev.next=null;
            temp.back=null;
            return head;
            
        }
        prev.next=front;
        front.back=prev;
        temp.next=temp.back=null;
        return head;
        
    }

    
}