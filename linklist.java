public class linklist{
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void Print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void Mid(){
        Node slow=head;
        Node fast =head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        linklist ll = new linklist();

        ll.push(3);
        ll.push(2);
        ll.push(1);
       
        ll.Mid();
        ll.Print();
        
    }
}