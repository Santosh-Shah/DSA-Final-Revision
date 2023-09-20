package linkedlist.singly;

import java.util.Scanner;

public class Q19_DeleteEveryNNodes {
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

    // TODO: method to odd numbers at first and even number at last
    public static Node<Integer> deleteEveryNNodes(Node<Integer> head, int m, int n) {
        // Base case
        if (head == null || m == 0) {
            return null;
        }

        if (n == 0) {
            return head;
        }

        Node<Integer> currenNode = head;
        Node<Integer> temp = null;

        while (currenNode != null) {
            int take = 0;
            int skip = 0;
            while (currenNode != null && take < m) {
                if (temp == null) {
                    temp = currenNode;
                } else {
                    temp.next = currenNode;
                    temp = temp.next;
                }
                currenNode = currenNode.next;
                take++;
            }

            while (currenNode != null && skip < n) {
                currenNode = currenNode.next;
                skip++;
            }
        }

        if (temp != null) {
            temp.next = null;
        }

        return head;

    }



    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printNode(head);
        head = deleteEveryNNodes(head, 2, 3);
        System.out.println();
        printNode(head);

    }
}
