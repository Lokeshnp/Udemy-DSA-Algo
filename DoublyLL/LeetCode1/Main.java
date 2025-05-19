package DoublyLL.LeetCode1;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);
        System.out.println(doublyLinkedList.isPalindrome());
        doublyLinkedList.append(8);
        System.out.println(doublyLinkedList.isPalindrome());


    }
}
