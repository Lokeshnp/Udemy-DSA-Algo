package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
    //    queue.printQueue();
//        queue.getFirst();
//        queue.getLast();
//        queue.getLength();
     //   System.out.println("**********");
        queue.enqueue(5);
        queue.printQueue();
        System.out.println("**********");
        System.out.println(queue.dequeue().value);
        System.out.println("**********");
        queue.printQueue();
        System.out.println("**********");
        System.out.println(queue.dequeue().value);
        System.out.println("After removing all the Node: ");
       queue.printQueue();
        System.out.println("**********");
        System.out.println(queue.dequeue());
    }
}
