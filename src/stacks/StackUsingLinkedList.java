package stacks;

public class StackUsingLinkedList {
    Node top; // this represents the top element of the stack
    int size; // this represents the size of the stack

    //to add element to the stack
    public void push(int data){
        Node n= new Node(data);

        if(isEmpty()){
            top= n;
            size++;
        }else{

            n.setNext(top);
            top = n;
            size++;
        }

    }

    // to get data from the stack
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int value= top.getData();
            Node temp= top;
            top = top.getNext();
            temp.setNext(null);
            size--;
            return value;
        }

    }

    //to check if stack is empty
    public boolean isEmpty(){
        if(top==null) return true;
        else return false;
    }

    //read top element of the stack
    public int peek(){
        if(isEmpty()==false){
            return top.getData();
        }else return -1;
    }

    //to print all elements in the stack
    public void traverse(){
        Node temp= top;

        while(temp!=null){

            System.out.println(temp.getData());
            temp=temp.getNext();

        }
    }


}
