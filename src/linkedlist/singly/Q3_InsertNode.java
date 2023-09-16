package linkedlist.singly;

import java.util.Scanner;

public class Q3_InsertNode {
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
                // it is not optimized code
//                Node<Integer> tail = head;
//                while (tail.next != null) {
//                    tail = tail.next;
//                }
//                tail.next = currentNode;

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

    // TODO: method to insert node at ith position
    public static Node<Integer> insertNode(Node<Integer> head, int pos, int data) {
        // data putting into node
        Node<Integer> newNode = new Node<>(data);

        // this will work only position is zero
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node<Integer> temp = head;
        int count = 0;
        while (count != pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }



    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printNode(head);
        head = insertNode(head, 4, 5);
        printNode(head);

    }
}
