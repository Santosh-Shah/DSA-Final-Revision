package binarytree;

import java.util.Scanner;

public class Q5_CountNodesGreaterThanX {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        printDetailed(root);
        System.out.println("Nodes greater than X are: " + countNodesGreaterThanX(root, 2));
    }

    // TODO: method to count nodes greater than x
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        // Base case
        if (root == null) {
            return 0;
        }

        int count = 0;
        if (root.data > x) {
            count++;
        }
        count = count + countNodesGreaterThanX(root.left, x);
        count = count + countNodesGreaterThanX(root.right, x);
        return count;
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
