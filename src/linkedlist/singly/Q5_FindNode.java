package linkedlist.singly;

import java.util.Scanner;

public class Q5_FindNode {
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

    // TODO: method to find node and return index of it
    public static int findNode(Node<Integer> head, int target) {
        // Base case
        if (head == null) {
            return -1;
        }

        Node<Integer> temp = head;
        int pos = 0;

        while (temp != null) {
            if (temp.data == target) {
                return pos;
            } else {
                temp = temp.next;
                pos++;
            }
        }
        return -1;
    }



    // Main Method
    public static void main(String[] args) {

        // Find Node
        Node<Integer> head = takeInput();
        printNode(head);
        System.out.println("Index: " + findNode(head, 5));

    }
}
