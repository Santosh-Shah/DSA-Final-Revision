package linkedlist.singly;

import java.util.Scanner;

public class Q20_SwapTwoNodes {
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

    // TODO: method to swap two nodes
    public static Node<Integer> swapTwoNodes(Node<Integer> head, int i, int j) {
        Node<Integer> curr1 = head;
        Node<Integer> curr2 = head;
        int pos = 0;

        while (pos < i) {
            curr1 = curr1.next;
            pos++;
        }

        pos = 0;
        while (pos < j) {
            curr2 = curr2.next;
            pos++;
        }

        int temp = curr1.data;
        curr1.data = curr2.data;
        curr2.data = temp;

        return head;

    }


    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printNode(head);
        head = swapTwoNodes(head, 2, 3);
        System.out.println();
        printNode(head);

    }
}
