public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
         myLinkedList.append(2);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println("\nLinkedList: ");
        myLinkedList.printList();
        System.out.println("==========================");
        System.out.println(myLinkedList.removeLastItem().value);
        System.out.println(myLinkedList.removeLastItem().value);
        System.out.println(myLinkedList.removeLastItem());
        myLinkedList.prepend(10);
        myLinkedList.append(20);
        myLinkedList.append(30);
        myLinkedList.printList();
        myLinkedList.prepend(50);
        System.out.println("Prepend");
        System.out.println("==========================");
        myLinkedList.printList();
        System.out.println("removeFirst");
        System.out.println("==========================");
        System.out.println( myLinkedList.removeFirst().value);
        System.out.println( myLinkedList.removeFirst().value);
        System.out.println( myLinkedList.removeFirst().value);
        System.out.println( myLinkedList.removeFirst().value);
        System.out.println( myLinkedList.removeFirst());
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        System.out.println("value by index");
        System.out.println("==========================");
        myLinkedList.printList();
        System.out.println("==========================");
        System.out.println(myLinkedList.getNodeByIndex(2).value);
        System.out.println("set the index by value");
        System.out.println("==========================");
        myLinkedList.printList();
        System.out.println(myLinkedList.setIndex(0, 5));
        myLinkedList.printList();
        System.out.println("insert the node");
        System.out.println("==========================");
        myLinkedList.printList();
        System.out.println(myLinkedList.insert(2, 10));
        System.out.println("Node inseted");
        System.out.println("==========================");
        myLinkedList.printList();

        System.out.println("Removing the node");
        System.out.println("==========================");
        myLinkedList.printList();
        System.out.println("Node removed");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("==========================");
        myLinkedList.printList();

        System.out.println("reverse");
        System.out.println("==========================");
        myLinkedList.printList();
        System.out.println("reversed");
        myLinkedList.reverse();
        System.out.println("==========================");
        myLinkedList.printList();

    }
}
