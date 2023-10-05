package trees;

public class Q7_HeightOfTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(1);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);

        // adding 2, 3, and 1 to root node
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        // adding 5 and 6 to node2
        node2.children.add(node4);
        node2.children.add(node5);


//        printTreeLevelWise(root);
        printTree2(root);
        System.out.println("Height of tree: " + height(root));


    }

    // TODO: method to print the height of tree
    public static int height(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int childHeight = height(root.children.get(i));
            if (ans < childHeight) {
                ans = childHeight;
            }
        }

        return ans + 1;
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
