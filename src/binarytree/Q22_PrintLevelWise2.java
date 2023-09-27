package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q22_PrintLevelWise2 {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
//        printDetailed(root);
        printLevelWise(root);
    }

    // TODO: method to print level wise
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        // this will run till queue become null
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

            if (frontNode == null) {
                if(pendingNodes.isEmpty()){
                    break;
                }
                System.out.println();
                pendingNodes.add(null);
            } else {
                System.out.print(frontNode.data + " ");
            }

            if (frontNode.left != null) {
                pendingNodes.add(frontNode.left);
            }

            if (frontNode.right != null) {
                pendingNodes.add(frontNode.right);
            }

        }
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
