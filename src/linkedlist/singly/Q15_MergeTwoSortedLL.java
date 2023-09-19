package linkedlist.singly;

import java.util.Scanner;

public class Q15_MergeTwoSortedLL {
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

    // TODO: method to merge two sorted LL
    public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2) {

        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        Node<Integer> currentHead = temp1;
        Node<Integer> head;

        if (temp1.data <= temp2.data) {
            currentHead = temp1;
            temp1= temp1.next;
        } else {
            currentHead = temp2;
            temp2 = temp2.next;
        }
        return currentHead;
    }



    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
        printNode(head1);
        System.out.println();
        printNode(head2);

        Node<Integer> head = mergeTwoSortedLL(head1, head2);
        System.out.println("After merger");
        printNode(head);

    }
}
