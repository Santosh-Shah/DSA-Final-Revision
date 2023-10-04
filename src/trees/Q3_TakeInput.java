package trees;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q3_TakeInput {
    public static void main(String[] args) {
//        TreeNode<Integer> tree = new TreeNode<>(10);
//        System.out.println(tree.data);
//        System.out.println(tree.children.size());

//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(1);
//        TreeNode<Integer> node4 = new TreeNode<>(5);
//        TreeNode<Integer> node5 = new TreeNode<>(6);
//
//        // adding 2, 3, and 1 to root node
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        // adding 5 and 6 to node2
//        node2.children.add(node4);
//        node2.children.add(node5);

//        printTree(root);
//        printTree2(root);

        TreeNode<Integer> root = takeInput();
        printTree2(root);


    }

    // TODO: method to take input
    public static TreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int data = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.println("Enter the size of children: ");
        int size = sc.nextInt();
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                TreeNode<Integer> childRoot = takeInput();
                root.children.add(childRoot);
            }
        }
        return root;
    }


    // TODO: method2 to print generic tree
    public static void printTree2(TreeNode<Integer> root) {
        // it is special case, base case is already handle by for loop
        if (root == null) {
            return;
        }

        System.out.print(root.data + ": ");

        // printing all children
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();

        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            printTree2(child);
        }
    }
}
