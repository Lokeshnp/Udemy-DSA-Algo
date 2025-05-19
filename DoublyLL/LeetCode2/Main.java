package DoublyLL.LeetCode2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.printList();
        doublyLinkedList.reverse();
        System.out.println("--------------");
        doublyLinkedList.printList();
    }
}
