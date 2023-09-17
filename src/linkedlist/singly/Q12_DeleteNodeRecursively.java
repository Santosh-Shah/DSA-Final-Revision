package linkedlist.singly;

import java.util.Scanner;

public class Q12_DeleteNodeRecursively {
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

    // TODO: Method to delete node at specific position
    public static Node<Integer> deleteNodeRecursively(Node<Integer> head, int pos) {
        // Base case
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        } else {
            head.next = deleteNodeRecursively(head.next, pos - 1);
            return head;
        }
    }

    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printRecursively(head);
        head = deleteNodeRecursively(head, 2);
        System.out.println();
        System.out.println("After deletion");
        printRecursively(head);


    }
}
