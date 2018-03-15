package stacks;

public class TestStack {
    public static void main(String[] args) {
       Stacks stacks= new Stacks();

       //adding data to stack
       stacks.push(1);
       stacks.push(2);
       stacks.push(3);
       stacks.push(4);

       //print the stack content
        stacks.traverse();

        // removing the data
        System.out.println("Popping out the data");

        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());

        System.out.println();
        System.out.println("Printing element in the stack");
        stacks.traverse();


        stacks.pop();

        System.out.println();
        System.out.println("Testing peek");
        stacks.peek();
    }
}
