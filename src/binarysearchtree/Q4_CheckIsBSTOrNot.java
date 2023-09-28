package binarysearchtree;

import binarytree.BinaryTreeNode;

import java.util.Scanner;

public class Q4_CheckIsBSTOrNot {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
//        int[] inOrder = {1, 2, 3, 4, 5, 6, 7};
//        int[] preOrder = {4, 2, 1, 3, 6, 5, 7};
//        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);

        int[] arr = {10, 2, 3, 4, 5, 6, 70};
        BinaryTreeNode<Integer> root = sortedArrayToBST(arr);

        printDetailed(root);
//        System.out.println(isBST(root));
//        System.out.println(isBST2(root).isBST + "max: " + isBST2(root).max + "min: " + isBST2(root).min);
        System.out.println(isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }

    // TODO: more optimized method to check binary tree is BST or Not
    public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
        if (root == null) {
            return true;
        }

        if (root.data < minRange || root.data > maxRange) {
            return false;
        }

        boolean isLeftWithinRange = isBST3(root.left, minRange, root.data - 1);
        boolean isRightWithinRange = isBST3(root.right, root.data, maxRange);
        return isRightWithinRange && isLeftWithinRange;
    }

    // TODO: optimized method to check binary tree is BST or Not
    public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            return ans;
        }

        IsBSTReturn leftAns = isBST2(root.left);
        IsBSTReturn rightAns = isBST2(root.right);
        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        boolean isBST = true;

        if (leftAns.max >= root.data) {
            isBST = false;
        }

        if (rightAns.min < root.data) {
            isBST = false;
        }

        if (!leftAns.isBST) {
            isBST = false;
        }

        if (!rightAns.isBST) {
            isBST = false;
        }

        IsBSTReturn ans = new IsBSTReturn(min, max, isBST);
        return ans;
    }

    // TODO: method to check binary tree is BST or not
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }

        int leftMax = maximum(root.left);
        if (leftMax >= root.data) {
            return false;
        }

        int rightMin = minimum(root.right);
        if (rightMin < root.data) {
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        return isLeftBST && isRightBST;
    }

    private static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    private static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr) {
        return sortedArrayToBST(arr, 0, arr.length - 1);
    }

    private static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int mid = (ei + si) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = sortedArrayToBST(arr, si, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, ei);
        return root;
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
