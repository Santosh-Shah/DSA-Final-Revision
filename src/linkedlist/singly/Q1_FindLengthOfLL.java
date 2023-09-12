package linkedlist.singly;

import javax.swing.plaf.IconUIResource;

public class Q1_FindLengthOfLL {
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

    // method to print linked list
    public static void printNode(Node<Integer> head) {
        // Base case
        if (head == null) {
            return;
        }

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main methods
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        System.out.println(lengthOfLL(head));
    }

    // Method to find length of linked list
    public static int lengthOfLL(Node<Integer> head) {
        //Base case
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
