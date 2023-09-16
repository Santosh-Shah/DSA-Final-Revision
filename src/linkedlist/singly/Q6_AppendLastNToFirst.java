package linkedlist.singly;

import java.util.Scanner;

public class Q6_AppendLastNToFirst {
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

    // TODO: method to append last N node to first
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        // Base condition
        if (head == null || n == 0) {
            return head;
        }

        Node<Integer> fast = head;
        Node<Integer> slow = head;

        // run till arrived target position
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // put temp to the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = head;
        head = temp;

        return head;
    }


    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printNode(head);
        head = appendLastNToFirst(head, 2);
        printNode(head);

    }
}
