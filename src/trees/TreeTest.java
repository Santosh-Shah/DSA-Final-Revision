package trees;

public class TreeTest {
    public static void main(String[] args) {
//        TreeNode<Integer> tree = new TreeNode<>(10);
//        System.out.println(tree.data);
//        System.out.println(tree.children.size());

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
    }
}
