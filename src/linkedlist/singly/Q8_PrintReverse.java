package linkedlist.singly;

import java.util.Scanner;

public class Q8_PrintReverse {
    // Method to take input
    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                // it will take O(1) TC
                tail.next = currentNode;
                tail = tail.next;

            }

            data = sc.nextInt();
        }
        return head;
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

    // TODO: method to print in reversed order
    public static void printReverse(Node<Integer> head) {
        // Base case
        Node<Integer> temp = head;
        if (temp == null) {
            return;
        }

        printReverse(temp.next);
        System.out.print(temp.data + " ");
    }


    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printNode(head);
        printReverse(head);

    }
}
