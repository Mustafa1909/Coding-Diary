public class swapNode{
    public static void main(String[] args) {
        swapNode list = new swapNode();
       list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

      
        list.Print();

        list.swap(2, 4);

        
        list.Print();
        
    }
     static class Node{
        int data;
        Node next;

        Node(int data){
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
        System.out.println("null");

    }
    public void swap(int x,int y){
        if(x==y){
            return;
        }
        Node prevX=null;
        Node currX=head;

        while(currX!=null && currX.data != x){
            prevX=currX;
            currX= currX.next;
        }
        Node prevY=null;
        Node currY = head;
         while(currY!=null && currY.data != y){
            prevY=currY;
            currY= currY.next;
        }
         if (currX == null || currY == null)
            return;
         // If x is not head
        if(prevX != null)
            prevX.next = currY;
            
        else
            head = currY;
        

        // If y is not head
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
     Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

    
}
}
