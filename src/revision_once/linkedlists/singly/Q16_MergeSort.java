package revision_once.linkedlists.singly;

import java.util.Scanner;

public class Q16_MergeSort {
    public static void main(String[] args) {
//        Node<Integer> head = createLL();
        Node<Integer> head = takeInput();
        printLL(head);
        System.out.println("\nAfter merge sort");
        head = mergeSort(head);
        printLL(head);
    }

    // TODO: method to merge sort
    public static Node<Integer> mergeSort(Node<Integer> head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // step1 find middle index
        Node<Integer> head1 = head;
        Node<Integer> head2 = middleNode(head);

        // step2 beak into equal half head1
        while (head1.next != head2) {
            head1 = head1.next;
        }
        head1.next = null;

        head = mergeSort(head);
        head2 = mergeSort(head2);
        return mergeSortedLL(head, head2);
    }

    public static Node<Integer> middleNode(Node<Integer> head) {
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2) {
        // Base case
        if (head1 == null) {
            return head1;
        }

        if (head2 == null) {
            return head2;
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
                tail  = temp2;
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            tail.next = temp1;
        }

        if (temp2 != null) {
            tail.next = temp2;
        }

        return head;
    }

    // method to reverse the node
    public static Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> prev = null;
        Node<Integer> current = head;
        while (current != null) {
            Node<Integer> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    //TODO: Take input
    public static Node<Integer> takeInput() {
        Node<Integer> tail = null;
        Node<Integer> head = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> currData = new Node<>(data);
            if (head == null) {
                head = currData;
                tail = currData;
            } else {
                tail.next = currData;
                tail = tail.next;
            }

            data = sc.nextInt();
        }

        return head;
    }

    public static void printLL(Node<Integer> head) {
        // Base case
        if (head == null) {
            return;
        }

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static Node<Integer> createLL() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }
}
