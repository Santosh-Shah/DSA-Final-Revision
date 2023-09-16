package linkedlist.singly;

import java.util.Scanner;

public class Q7_EliminateDuplicates {
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

    // TODO: method to eliminate duplicates
    public static Node<Integer> eliminateDuplicates(Node<Integer> head) {
        // Base condition
        if (head == null) {
            return head;
        }

        Node<Integer> temp = head;
        while (temp.next != null) {
            if (temp.data.equals(temp.next.data)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }


    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printNode(head);
        eliminateDuplicates(head);
        printNode(head);

    }
}
