package binarytree;

import java.util.Scanner;

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

    // Methods to print binary tree in detailed
    public static void printDetailed(BinaryTreeNode<Integer> root) {
        // Base case
        if (root == null) {
            return;
        }
        System.out.print(root.data + ": ");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }

        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printDetailed(root.left);
        printDetailed(root.right);
    }

    // method to take input
    public static BinaryTreeNode<Integer> takeInput() {
        System.out.print("Enter root data: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        BinaryTreeNode<Integer> rootLeft = takeInput();
        BinaryTreeNode<Integer> rootRight = takeInput();
        root.left = rootLeft;
        root.right = rootRight;
        return root;
    }
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//        BinaryTreeNode<Integer> rootLeftRight = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> rootRightLeft = new BinaryTreeNode<>(5);
//        root.left = rootLeft;
//        root.right = rootRight;
//        rootLeft.right = rootLeftRight;
//        rootRight.left = rootRightLeft;

        BinaryTreeNode<Integer> root = takeInput();
//        printBinaryTree(root);
        printDetailed(root);
    }
}
