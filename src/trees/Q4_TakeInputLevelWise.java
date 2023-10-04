package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q4_TakeInputLevelWise {
    public static void main(String[] args) {

        TreeNode<Integer> root = takeInputLevelWise();
        printTree2(root);


    }

    // TODO: method to take input level wise
    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data: ");
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter the no of Children for: " + front.data);
            int numChild = sc.nextInt();
            for (int i = 0; i < numChild; i++) {
                System.out.println("Enter the " + i + "th child data for " + front.data);
                int childData = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.add(childNode);
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
