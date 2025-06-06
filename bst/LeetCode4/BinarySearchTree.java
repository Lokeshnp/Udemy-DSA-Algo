package bst.LeetCode4;

import java.util.Stack;


public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

   public Integer kthSmallest(int k){
        Stack<Node> stack = new Stack<>();
        Node node = this.root;
        while(!stack.isEmpty() || node != null){
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            k -=1;
            if(k==0) return node.value;
            node = node.right;
        }
        return null;
   }


}


