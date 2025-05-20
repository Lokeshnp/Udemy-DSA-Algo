package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
      //  stack.printStack();
//        stack.getLength();
//        stack.getTop();
        stack.push(5);
        System.out.println("+++++++++++++++");
        stack.printStack();
        System.out.println("%%%%%%%%%%%%%%");
        System.out.println( stack.pop().value);
        System.out.println("+++++++++++++++");
        stack.printStack();


    }
}
