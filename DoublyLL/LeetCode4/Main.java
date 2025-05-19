package DoublyLL.LeetCode4;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);doublyLinkedList.append(3);doublyLinkedList.append(4);doublyLinkedList.append(5);
        doublyLinkedList.printList();
        System.out.println("++++++++++++++++++++++++++");
        doublyLinkedList.reverseBetween(1,3);
        doublyLinkedList.printList();

    }
}
