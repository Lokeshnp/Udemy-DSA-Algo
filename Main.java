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

    }
}
