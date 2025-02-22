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
        System.out.println(myLinkedList.getValueByIndex(2).value);

    }
}
