package binarysearchtree;

import binarytree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Scanner;

public class Q5_BSTToLinkedList {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        int[] inOrder = {1, 2, 3, 4, 5, 6, 7};
        int[] preOrder = {4, 2, 1, 3, 6, 5, 7};
        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);
        Node<Integer> head = constructLinkedList(root);
        printLinkedList(head);
//        printDetailed(root);
    }

    // TODO: method to construct linked-list from BST
    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        return constructLinkedListHelper(root).head;
    }

    private static PairOfNodeElem constructLinkedListHelper(BinaryTreeNode<Integer> root)  {
        if (root == null) {
            PairOfNodeElem pair = new PairOfNodeElem();
            return pair;
        }

        Node<Integer> newNode = new Node<>(root.data);
        PairOfNodeElem leftList = constructLinkedListHelper(root.left);
        PairOfNodeElem rightList = constructLinkedListHelper(root.right);
        PairOfNodeElem pair = new PairOfNodeElem();
        if (leftList.tail != null) {
            leftList.tail.next = newNode;
        }

        newNode.next = rightList.head;

        if (leftList.head != null) {
            pair.head = leftList.head;
        } else {
            pair.head = newNode;
        }

        if (rightList.tail != null) {
            pair.tail = rightList.tail;
        } else {
            pair.tail = newNode;
        }

        return pair;
    }

    // method to print Linkedlist
    public static void printLinkedList(Node<Integer> head) {
        if (head == null) {
            return;
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // method to build tree using pre_order and in_order
    public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in) {
        BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
        return root;
    }

    private static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int[] pre, int[] in, int siPre, int eiPre, int siIn, int eiIn) {
        if (siPre > eiPre) {
            return null;
        }


        int rootData = pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        // find root index in in-order
        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (in[i] == rootData) {
                rootIndex = i;
                break;
            }
        }

//        if (rootIndex == -1) {
//            return null;
//        }

        int siPreLeft = siPre + 1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;

        int siInRight = rootIndex + 1;
        int eiPreRight = eiPre;
        int eiInRight = eiIn;

        // finding length of left subtree
        int leftSubTreeLength = eiInLeft - siInLeft + 1;

        int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
        int siPreRight = eiPreLeft + 1;

        BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
        root.left = left;
        root.right = right;
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
