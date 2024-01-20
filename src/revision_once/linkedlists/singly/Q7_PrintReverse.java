package revision_once.linkedlists.singly;

public class Q7_PrintReverse {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        printLL(head);
        System.out.println();
        printReverse(head);

    }

    public static void printReverse(Node<Integer> head) {
        // Base Case
        if (head == null) {
            return;
        }
        Node<Integer> temp = head;
        printReverse(temp.next);
        System.out.print(temp.data + " ");
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
