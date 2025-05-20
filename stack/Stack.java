package stack;

public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height=1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
         height++;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node pop(){
        Node temp = top;
        if(top == null) return null;
        top = top.next;
        temp.next = null;
        height --;
        return temp;
    }

        public void getTop(){
            System.out.println("top of the stack: "+top.value);
        }

    public void getLength(){
        System.out.println("Height of the stack: "+height);
    }



}
