package linkedlist.singly;

import java.util.Scanner;

public class Q16_MergeSort {
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

    // method to merge two sorted LL
    public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2) {
        // Base case
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        Node<Integer> head;
        Node<Integer> tail;

        if (temp1.data <= temp2.data) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        } else {
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }

        // this will only temp1 has still nodes
        if (temp1 != null) {
            tail.next = temp1;
        }

        // this will only temp2 has still nodes
        if (temp2 != null) {
            tail.next = temp2;
        }

        return head;
    }

    // method to find middle node
    public static Node<Integer> middleNode(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }


        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    // TODO: method of merge sort
    public static Node<Integer> mergeSort(Node<Integer> head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> head1 = head;
        Node<Integer> head2 = middleNode(head);
        while (head1.next != head2) {
            head1 = head1.next;
        }
        head1.next = null;

        head = mergeSort(head);
        head2 = mergeSort(head2);

        return mergeTwoSortedLL(head, head2);
//        return temp;
    }



    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printNode(head);
        System.out.println("After merge sorting");
        head = mergeSort(head);
        printNode(head);

    }
}
