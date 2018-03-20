package linkedlist;

import linkedlist.LinkedList;

public class TestClass {

    public static void main(String[] args) {

        LinkedList linkedList= new LinkedList();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);


//        linkedList.traverse();
//
//        linkedList.contains(3);
//        linkedList.contains(4);

        System.out.println("\n----------Before deleting----------");
        linkedList.traverse();

        //testing delete method
        linkedList.delete(3);

        System.out.println();
        System.out.println();
        System.out.println("   After deleting 3   ");
        linkedList.traverse();

        System.out.println();
        System.out.println();
        System.out.println("   --delete 4--       ");
        linkedList.delete(4);
        linkedList.traverse();


    }
}
