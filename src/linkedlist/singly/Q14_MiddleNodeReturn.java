package linkedlist.singly;

import java.util.Scanner;

public class Q14_MiddleNodeReturn {
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

    // TODO: Method to return middle node of LL (according to my approach)
    public static Node<Integer> middleNodeReturnByMyApproach(Node<Integer> head) {
        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        int count = length(head);
        Node<Integer> temp = head;
        int middleIndex = count / 2;
        for (int i = 0; i < middleIndex; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static int length(Node<Integer> head) {
        Node<Integer> temp = head;
        if (temp == null) {
            return 0;
        }

        int count = length(temp.next);
        count++;
        return count;
    }


    // TODO: Method to return middle node of LL
    public static Node<Integer> middleNodeReturn(Node<Integer> head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Main Method
    public static void main(String[] args) {

        // insert node at ith position
        Node<Integer> head = takeInput();
        printRecursively(head);
        System.out.println();
//        System.out.println(length(head));
//        System.out.println(middleNodeReturnByMyApproach(head).data);
        System.out.println(middleNodeReturn(head).data);


    }
}
