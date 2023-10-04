package trees;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q3_TakeInput {
    public static void main(String[] args) {

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
