package revision_once.linkedlists.singly;

public class Q1_FindLengthOfLL {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        int length = printLength(head);
        System.out.println(length);
    }

    public static int printLength(Node<Integer> head) {
        // Base case
        if (head == null) {
            return 0;
        }
        int length = 0;

        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
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
}
