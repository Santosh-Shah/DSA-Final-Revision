package binarytree;

import java.util.Scanner;

public class Q19_BuildTreeUsingPostOrderAndInOrder {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
        int[] postOrder = {4, 5, 2, 3, 1};
        int[] inOrder = {4, 2, 5, 1, 3};
        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder);
        printDetailed(root);
//        printLevelWise(root);
    }

    // TODO: method to build tree using post_order and in_order
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here
        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0 ,postOrder.length-1, 0, inOrder.length-1);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int siPost, int eiPost, int siIn, int eiIn) {
        // TODO Auto-generated method stub

        //Base case - If number of elements in the post-order is 0
        if (siPost>eiPost)
        {
            return null;
        }

        //Defining the root node for current recursion
        int rootData=postOrder[eiPost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        //Finding root data's location in Inorder (Assuming root data exists in Inorder)
        int rootIndex=-1;
        for (int i=siIn;i<=eiIn;i++)
        {
            if (rootData==inOrder[i])
            {
                rootIndex=i;
                break;
            }
        }

        //Defining index limits for Left Subtree Inorder
        int siInLeft=siIn;
        int eiInLeft=rootIndex-1;

        //Defining the index limits for Left Subtree Preorder
        int siPostLeft=siPost;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPostLeft=(siPostLeft)+(leftSubTreeLength-1);

        //Defining index limits for Right Subtree Inorder
        int siInRight=rootIndex+1;
        int eiInRight=eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPostRight=eiPostLeft+1;
        int eiPostRight=eiPost-1;

        BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);
        BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);

        root.left=leftChild;
        root.right=rightChild;
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
