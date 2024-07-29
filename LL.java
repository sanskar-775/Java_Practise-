

public class LL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public void addFirst(int data){
        //create a new node
        Node newnode= new Node(data);
        size++;
        //bsae case test 
        if(head==null){
            head=tail=newnode;
            return;
        }
        //if base case not there then 
        //we link the new node ka next to the head node
        newnode.next= head;
        //changing the head 
        head=newnode;

    }
    public void addLast(int data){
        Node newNode=new Node(data);//creatation of new node
        size++;
        if(head==null){//base case
            head=tail=newNode;
            return;
        }
        tail.next=newNode;//tail -> newnode
        tail=newNode;//newNode ko tail
    }
    public void print(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.println("null");
    }
    public void addMid(int idx, int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node temp = head ;
        int i=0;
        while(i!= idx-1){
            temp=temp.next;
            i++;
        }
        Node newnode=new Node(data);
        size++;
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removeFirst(){
        if(head== null){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        Node prev =head;
        if(size==0){
            System.out.println("Empty list");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int i=0;
        while(i!=size-2){
            prev=prev.next;
            i++;
        }
        int val = tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
        
    }
    public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int RecSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev =null;
        Node curr=tail=head;
        Node Next;
        while (curr!=null) {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        head=prev;
    }
    public void removefromlast(int n){
        Node temp=head;
        int sz=0;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        Node prev=head;
        int idx=1;
        while(idx<sz-n){
            prev=prev.next;
            idx++;
        }
        prev.next=prev.next.next;
        return;
    }
    // SLOW FAST APPROCH
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean checkPalindrom(){
        if(head==null||head.next==null){
            return true;
        }
        //step 1 find mid 
        Node mid=findMid(head);

        //step 2 reverse half from mid
        Node prev=null;
        Node curr= mid;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //step 3 check left and right 
        Node right= prev;// right half ka head
        Node left= head;
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    //FCFA
    //concept : using slow and fast pointers we find if at any point slow becomes equal to fast then 
    public static boolean iscycle(){// flyods cycle finding algo
       Node slow =head;
       Node fast = head;
       while (fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            return true;
        }
       }
        return false;
    }
    public static void removecycle(){
        Node slow = head;
        Node fast= head;
        boolean cycle = false;
        //detect the cycle
        while(fast!=null&&fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
            if (slow==fast) {
                cycle=true;
                break;
            }
        }
        if(cycle ==false){
            return;
        }
        //finding the meeting point 
        slow=head;
        Node prev= null;
        while (slow!=fast) {
            slow=slow.next;
            prev= fast;
            fast= fast.next;

        }
        // removeing the cycle
        prev.next=null;

    }
    public static Node getmid(Node head){
        Node slow= head;
        Node fast = head.next;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node mergesort(Node head){
        //mid
        Node mid=getmid(head);
        //divide
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(righthead);
        //merge
        return merge(newleft,newright);

    }
    public static Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2!= null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;

            }
        }
        if(head1!=null)temp.next=head1;
        if(head2!=null)temp.next=head2;
        return mergedLL.next;

    }
    //ZIG ZAG  a linked list 
    public void ZigZag(Node head){
        Node mid=getmid(head);
        //reversing the half
        Node prev = null;
        Node curr= mid.next;
        mid.next=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node lthead=head;
        Node rthead= prev; 
        Node nextL,nextR;
        while (lthead!=null&&rthead!=null) {
            //zigzag
            nextL=lthead.next;
            lthead.next=rthead;
            nextR=rthead.next;
            rthead.next=nextL;
            //update
            lthead=nextL;
            rthead=nextR;
        }
    }
    public static void main (String args[]){
        LL ll =new LL();
         ll.addFirst(3);
         ll.addFirst(2);
         ll.addFirst(1);
         ll.addLast(4);
         ll.addLast(5);
        // ll.addMid(3, 12);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // // int idx=ll.RecSearch(1);
        // // System.out.println(idx);
        // ll.reverse();
        // ll.print();
        // ll.removefromlast(3);
        // ll.print();
        // System.out.println(ll.checkPalindrom());
        // head = new Node(1);
        // Node temp= new Node(2);
        // head.next=temp;
        // head.next.next= new Node(3);
        // head.next.next.next=temp;
        // //head.next.next.next=head;//for edge case head loop 
        // System.out.println(iscycle());
        // removecycle();
        // System.out.println(iscycle());
        ll.print();
        ll.ZigZag(head);
        ll.print();

    }

}