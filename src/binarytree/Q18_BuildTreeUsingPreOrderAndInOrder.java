package binarytree;

import java.util.Scanner;

public class Q18_BuildTreeUsingPreOrderAndInOrder {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        int[] preOrder = {4, 2, 5, 1, 3};
        int[] inOrder = {1, 2, 4, 5, 3};
        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);
        printDetailed(root);
//        printLevelWise(root);
    }

    // TODO: method to build tree using pre_order and in_order
    public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in) {
//        BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);

        int n = pre.length;
        int preStart = 0;
        int preEnd = n - 1;
        int inStart = 0;
        int inEnd = n - 1;
        BinaryTreeNode<Integer> root = buildTreeHelper(pre, preStart, preEnd, in, inStart, inEnd);
        return root;
    }

//    private static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int[] pre, int[] in, int siPre, int eiPre, int siIn, int eiIn) {
//        if (siPre > eiPre) {
//            return null;
//        }
//
//
//        int rootData = pre[siPre];
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//
//        // find root index in in-order
//        int rootIndex = -1;
//        for (int i = siIn; i <= eiIn; i++) {
//            if (in[i] == rootData) {
//                rootIndex = i;
//                break;
//            }
//        }
//
////        if (rootIndex == -1) {
////            return null;
////        }
//
//        int siPreLeft = siPre + 1;
//        int siInLeft = siIn;
//        int eiInLeft = rootIndex - 1;
//
//        int siInRight = rootIndex + 1;
//        int eiPreRight = eiPre;
//        int eiInRight = eiIn;
//
//        // finding length of left subtree
//        int leftSubTreeLength = eiInLeft - siInLeft + 1;
//
//        int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
//        int siPreRight = eiPreLeft + 1;
//
//        BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
//        BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
//        root.left = left;
//        root.right = right;
//        return root;
//    }

    private static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootVal = preOrder[preStart];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootVal);

        // find root element index from inOrder array
        int k = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (rootVal == inOrder[i]) {
                k = i;
                break;
            }
        }

        root.left = buildTreeHelper(preOrder, preStart + 1, preStart + (k - inStart), inOrder, inStart, k - 1);
        root.right = buildTreeHelper(preOrder, preStart + (k - inStart) + 1, preEnd, inOrder, k + 1, inEnd);
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
