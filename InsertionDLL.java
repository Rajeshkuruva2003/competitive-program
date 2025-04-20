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
        head=insertHead(head,10);
        head=insertTail(head,11);
        head=insertBeforeTail(head,12);
        head=insertK(head,35,3);
        insertBeforeNode(head.next.next,100);
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
    public static Node insertHead(Node head,int data){
     
        Node temp=new Node(data,head,null);
       head.back=temp;
        
        return temp;
    }
    public static Node insertTail(Node head,int data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        
        Node newNode=new Node(data,temp,null);
        temp.next=newNode;
        newNode.back=temp;
        newNode.next=null;
        
        return head;
        
    }
    public static Node insertBeforeTail(Node head,int data){
        if(head==null){
            return insertBeforeTail(head,data);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node prev=temp.back;
        Node newNode=new Node(data,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
       
            
        
         return head;
    }
    public static Node insertK(Node head,int data,int pos){
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==pos){
                break;
            }
            temp=temp.next;
            
        }
        Node prev=temp.back;
        Node newNode=new Node(data,temp,prev);
        prev.next=newNode;
        newNode.next=temp;
        newNode.back=prev;
        temp.back=newNode;
        return head;
    }
    public static Node insertBeforeNode(Node node,int data ){
        Node prev=node.back;
        Node newNode=new Node(data,node,prev);
        prev.next=newNode;
        node.back=newNode;
        return newNode;
        
    }
}