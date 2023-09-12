package linkedlist.singly;

public class Q2_PrintIthElement {
    // methods to use linked list for practice
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    // Main method
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        printIthElement(head, 1);
    }

    // Method to print ith element
    public static void printIthElement(Node<Integer> head, int i) {
        // Base case
        if (head == null) {
            return;
        }

        Node<Integer> temp = head;
        int pos = 0;
        while (temp != null) {
            if (i == pos) {
                System.out.println(temp.data);
                return;
            }
            pos++;
            temp = temp.next;
        }

    }
}
