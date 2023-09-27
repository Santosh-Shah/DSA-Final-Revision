package binarytree;

import java.util.Scanner;

public class Q21_GetMinAndMaxElement {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        int[] inOrder = {4, 2, 5, 1, 3};
        int[] preOrder = {1, 2, 4, 5, 3};
        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);
//        printDetailed(root);
        Pair<Integer, Integer> value = getMinAndMax(root);
        System.out.println("Minimum: " + value.minimum);
        System.out.println("Maximum: " + value.maximum);
    }

    // TODO: method to get minimum and maximum elements
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Pair<Integer, Integer> leftPair = getMinAndMax(root.left);
        Pair<Integer, Integer> rightPair = getMinAndMax(root.right);

        int minimum = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
        int maximum = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));

        return new Pair<>(minimum, maximum);
    }
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<>(root.data);
        duplicateNode.left = root.left;
        root.left = duplicateNode;
        insertDuplicateNode(duplicateNode.left);
        insertDuplicateNode(root.right);
        return;
    }

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
