package binarysearchtree;

import binarytree.BinaryTreeNode;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    // check is data present or not
    public boolean isPresent(int x) {
        return isPresent(root, x);
    }


    private static boolean isPresent(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return false;
        }

        if (root.data == x) {
            return true;
        }

        if (x < root.data) {
            // call in left side
            return isPresent(root.left, x);
        } else {
            // call in right side
            return isPresent(root.right, x);
        }
    }

    // insert data
    public void insert(int x) {
        root = insert(root, x);
    }

    private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(x);
            return newNode;
        }

        if (x >= root.data) {
            // call right side
            root.right = insert(root.right, x);
        } else {
            // call left side
            root.left = insert(root.left, x);
        }
        return root;
    }

    // delete data
    public boolean deleteData(int x) {
        return false;
    }

    // return size
    public int size() {
        return size;
    }

    // print tree
    public void printTree() {
        printDetailed(root);
    }

    private static void printDetailed(BinaryTreeNode<Integer> root) {
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


}
