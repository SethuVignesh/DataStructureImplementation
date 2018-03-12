public class LinkedList {
    Node head;
    int size;

    public void append(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }

    }


    public void traverse(){

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data );
            System.out.print("--->");
            temp=temp.next;
        }
    }

    //search
    public boolean contains(int data){
        Node temp=head;

        while(temp!=null){
            if(temp.data == data){
                return true;
            }
            temp=temp.next;
        }
        return false;

    }

    public void delete(int data){
       Node curr=head;
       Node prev=head;

       if(curr.data==data){
           head=head.next;
       }

       while(curr.next!=null){
           prev=curr;
           curr=curr.next;

           if(curr.data==data){
               prev.next=curr.next;
               break;
           }
       }

    }
}
