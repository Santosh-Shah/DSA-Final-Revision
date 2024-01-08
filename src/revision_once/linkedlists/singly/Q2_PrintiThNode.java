package revision_once.linkedlists.singly;

public class Q2_PrintiThNode {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        printLL(head);
        System.out.print("\nTarget Index node: ");
        printIthNode(head, 3);

    }

    //TODO print ith node
    public static void printIthNode(Node<Integer> head, int i) {
        // Base case
        if (head == null || i < 0) {
            return;
        }

        Node<Integer> temp = head;
        int count = i;
        while (count != 0) {
            count--;
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    public static Node<Integer> createLL() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }

    public static void printLL(Node<Integer> head) {
        // Base case
        if (head == null) {
            return;
        }

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
