package revision_once.linkedlists.singly;

public class Q4_DeleteNode {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        printLL(head);
        System.out.println("\nAfter deleting node");
        head = deleteNode(head, 5);
        printLL(head);

    }

    //TODO: Insert node at ith position
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // Base case
        if (head == null) {
            return null;
        }

        Node<Integer> temp = head;

        // if you want to add at first position
        if (pos == 0) {
            return head.next;
        }

        int index = pos;
        while (index != 1 && temp != null) {
            temp = temp.next;
            index--;
        }

        if (temp == null) {
            return head;
        }

        temp.next = temp.next.next;
        return head;
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
