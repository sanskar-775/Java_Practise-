public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev= newNode;
        head=newNode;
    }
    public void print(){
        Node temp = head ;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        head.prev=null;
        return val;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newNode.prev=temp;
        temp.next=newNode;
        tail=newNode;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        int val=temp.data;
        temp.prev.next=null;
        size--;
        return val;
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;

        }
        head=prev;
    }

    public static void main(String []args){
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // int val=dll.removeFirst();
        // System.out.println(val);
        // dll.print();
        // dll.addLast(5);
        // dll.print();
        // dll.removeLast();
        dll.reverse();
        dll.print();


    }
}
