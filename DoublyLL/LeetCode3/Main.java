package DoublyLL.LeetCode3;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(3);
        doublyLinkedList.append(8);doublyLinkedList.append(5);doublyLinkedList.append(10);
        doublyLinkedList.append(2);doublyLinkedList.append(1);
        doublyLinkedList.printList();
        System.out.println("+++++++++++++++++++");
        doublyLinkedList.partitionList(5);
        doublyLinkedList.printList();
    }
}
