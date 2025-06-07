package bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
//        System.out.println("Root is: "+myBST.root);
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        myBST.insert(27);
//        System.out.println(myBST.root.left.right.value);
//        System.out.println("**********************************");
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.contains(27));
//        System.out.println(myBST.contains(17));
//
//        System.out.println("====================================");
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.rContains(27));
//        System.out.println(myBST.rContains(17));

//        myBST.rInsert(2);
//        myBST.rInsert(1);
//        myBST.rInsert(3);
//
//        System.out.println("\nRoot: "+myBST.root.value);
//        System.out.println("\nRoot->left: "+myBST.root.left.value);
//        System.out.println("\nRoot->right: "+myBST.root.right.value);

//                System.out.println("====================================");
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.minValue(myBST.root));
//        System.out.println(myBST.minValue(myBST.root.right));

//        System.out.println("====================================");
//                myBST.rInsert(2);
//        myBST.rInsert(1);
//        myBST.rInsert(3);
//
//                System.out.println("\nRoot: "+myBST.root.value);
//        System.out.println("\nRoot->left: "+myBST.root.left.value);
//        System.out.println("\nRoot->right: "+myBST.root.right.value);
//
//        System.out.println("====================================");
//        myBST.deleteNode(2);
//
//        System.out.println("\nRoot: "+myBST.root.value);
//        System.out.println("\nRoot->left: "+myBST.root.left.value);
//        System.out.println("\nRoot->right: "+myBST.root.right);

//                        System.out.println("====================================");
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.BFS());

//        System.out.println("====================================");
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.DFSPreOrder());

//        System.out.println("====================================");
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        System.out.println(myBST.DFSPostOrder());

        System.out.println("====================================");
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println(myBST.DFSInOrder());

    }
}
