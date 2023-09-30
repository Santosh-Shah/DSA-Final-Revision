package binarysearchtree;

public class BSTUse {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(10);
        bst.insert(15);
        bst.insert(1);
        bst.printTree();
        System.out.println(bst.isPresent(100));
    }
}
