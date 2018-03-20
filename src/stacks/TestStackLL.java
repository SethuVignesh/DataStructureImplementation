package stacks;

public class TestStackLL {

    public static void main(String[] args) {
        StackUsingLinkedList stack= new StackUsingLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("--------Printing stack elements--------");
        stack.traverse();

        System.out.println("-----testing pop()-----");
        System.out.println(stack.pop());

        System.out.println("----print stack after doing pop()---");

        stack.traverse();

        System.out.println("-----Testing peek()----");
        System.out.println(stack.peek());

        System.out.println("Printing stack after peek operation");
        stack.traverse();

        System.out.println("--Run pop on empty stack---");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // this code is availble in github
        //check description
    }
}
