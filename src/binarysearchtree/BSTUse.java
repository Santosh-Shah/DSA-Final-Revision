package binarysearchtree;

public class BSTUse {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(4);
        bst.insert(2);
        bst.insert(6);
        bst.insert(1);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);
        bst.insert(8);
        bst.printTree();
        System.out.println("Deleted: " + bst.deleteData(6));
        bst.printTree();
        System.out.println("Deleted: " + bst.deleteData(4));
        bst.printTree();
//        System.out.println(bst.isPresent(100));
//        System.out.println(bst.size());
    }
}
