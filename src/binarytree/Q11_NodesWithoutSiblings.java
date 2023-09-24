package binarytree;

import java.util.Scanner;

public class Q11_NodesWithoutSiblings {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        printDetailed(root);
        nodesWithoutSiblings(root);
    }

    // TODO: method to print nodes without siblings
    public static void nodesWithoutSiblings(BinaryTreeNode<Integer> root) {
        // Base case
       if (root == null) {
           return;
       }

       if (root.left != null && root.right == null) {
           System.out.print(root.left.data + " ");
       }

       if (root.left == null && root.right != null) {
           System.out.print(root.right.data + " ");
       }
       nodesWithoutSiblings(root.left);
       nodesWithoutSiblings(root.right);
    }

    // method to take input in better way
    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data: ");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of: " + parentData);
            } else {
                System.out.println("Enter right child of: " + parentData);
            }
        }

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> rootLeft = takeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rootRight = takeInputBetter(false, rootData, false);
        root.left = rootLeft;
        root.right = rootRight;
        return root;
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

}
