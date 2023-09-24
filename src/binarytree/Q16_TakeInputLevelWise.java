package binarytree;

import org.w3c.dom.traversal.NodeIterator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q16_TakeInputLevelWise {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printDetailed(root);
    }

    // TODO: method to take input level wise
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        System.out.println("Enter root data: ");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of: " + front.data);
            int left = sc.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(left);
                front.left = leftNode;
                pendingChildren.add(leftNode);
            }

//            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter right child of: " + front.data);
            int right = sc.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(right);
                front.right = rightNode;
                pendingChildren.add(rightNode);
            }
        }

        return root;
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
