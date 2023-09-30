package binarysearchtree;

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
        size++;
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
        BSTDeleteReturn output = deleteDataHelper(root, x);
        root = output.root;
        if (output.deleted) {
            size--;
        }
        return output.deleted;
    }

    public static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return new BSTDeleteReturn(null, false);
        }

        if (root.data < x) {
            BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }

        if (root.data > x) {
            BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
            root.left = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }

        // 0 children
        if (root.left == null && root.right == null) {
            return new BSTDeleteReturn(null, true);
        }

        // only left child
        if (root.left != null && root.right == null) {
            return new BSTDeleteReturn(root.left, true);
        }

        // only right child
        if (root.left == null && root.right != null) {
            return new BSTDeleteReturn(root.right, true);
        }

        // both children are present
        int rightMax = minimum(root.right);
        root.data = rightMax;
        BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMax);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);
    }


    private static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    // return size
    public int size() {
        if (root == null) {
            return 0;
        }
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
