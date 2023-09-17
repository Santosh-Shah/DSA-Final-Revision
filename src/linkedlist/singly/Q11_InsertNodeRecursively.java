package linkedlist.singly;

import java.util.Scanner;

public class Q11_InsertNodeRecursively {
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

    // methods to print recursively
    public static void printRecursively(Node<Integer> head) {
        // Base case
        if (head == null) {
            return;
        }

        System.out.print(head.data + " ");          // this will print in normal order
        printRecursively(head.next);
//        System.out.print(head.data + " ");        // this will print in reverse order
    }

    // Method to insert node at specific position
    public static Node<Integer> insertNodeRecursively(Node<Integer> head, int elem, int pos) {
        // Base case
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertNodeRecursively(head.next, elem, pos - 1);
            return head;
        }
    }

    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printRecursively(head);
        head = insertNodeRecursively(head, 20, 0);
        System.out.println();
        System.out.println("After insertion");
        printRecursively(head);


    }
}
