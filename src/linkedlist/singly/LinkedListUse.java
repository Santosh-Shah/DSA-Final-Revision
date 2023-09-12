package linkedlist.singly;

import java.util.HexFormat;

public class LinkedListUse {
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
//        System.out.println(head.data);
//        System.out.println(head.next.next.next.data);
//        System.out.println(head.next.next.next.next);
    }

    // Methods to increase all data
    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
//            temp.data = temp.data + 1;   // either do like this
            temp.data++; // Or like this
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
//        Node<Integer> n1 = new Node<>(50);
//        System.out.println(n1);
//        System.out.println(n1.next);
//        System.out.println(n1.data.doubleValue());
//
//        Node<String> n2 = new Node<>("Santosh Shah");
//        System.out.println(n2);
//        System.out.println(n2.data);
//        System.out.println(n2.next);

        Node<Integer> head = createLinkedList();
        printNode(head);
        increment(head);
        printNode(head);

    }
}
