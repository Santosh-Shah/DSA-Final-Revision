package linkedlist.singly;

import java.util.Scanner;

public class Q13_ReverseLLRecursively {
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

    // TODO: Method to reverse LL
    public static Node<Integer> reverseLLRecursively(Node<Integer> head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> smallHead = reverseLLRecursively(head.next);
        Node<Integer> tail = smallHead;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;
        head.next = null;
        return smallHead;
    }


    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printRecursively(head);
        head = reverseLLRecursively(head);
        System.out.println();
        printRecursively(head);


    }
}
