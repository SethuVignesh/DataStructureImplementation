package stacks;

public class Node {
    // create variables of node class
    private int data;
    private Node next;

    public Node(){}
    public Node(int data){
        this.data=data;
    }

    public void setData(int data){
        this.data=data;
    }

    public void setNext(Node node){
        this.next= node;
    }

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }
}
