package binarytree;

public class BinaryTreeUse {
    // Methods to print binary root nodes
    public static void printBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLeftRight = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootRightLeft = new BinaryTreeNode<>(5);
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.right = rootLeftRight;
        rootRight.left = rootRightLeft;
        printBinaryTree(root);
    }
}
