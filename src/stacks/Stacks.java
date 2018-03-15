package stacks;

public class Stacks {
    // decide the max size of the stack
    int MAX = 1000;

    //create empty array of max size
    int[] arr = new int[MAX];

    int top = -1; // this will point to the top element of the stack

    // to add element to the stack
    public void push(int data) {
        if (isFull() == false) {
            top = top + 1;
            arr[top] = data;
        } else {
            System.out.println("Stack is full");
        }
    }

    //to get element from the stack
    public int pop() {
        if (isEmpty() == false) {
            int data = arr[top];
            arr[top] = 0;
            top = top - 1;
            return data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    //to check stack is full
    public boolean isFull() {
        if (top < MAX) return false;
        else return true;
    }

    //to check the stack is empty
    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    //to print element of the stack
    public void traverse() {
        System.out.println("Printing stack");
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public void peek(){
        if(isEmpty()==false){
            System.out.println(arr[top]);
        }else {
            System.out.println("Stack is empty");
        }
    }
}
