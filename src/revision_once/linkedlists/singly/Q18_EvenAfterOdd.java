package revision_once.linkedlists.singly;

import java.util.Scanner;

public class Q18_EvenAfterOdd {
    public static void main(String[] args) {
//        Node<Integer> head = createLL();
        Node<Integer> head = takeInput();
        printLL(head);
        head = evenAfterOdd(head);
        System.out.println();
        printLL(head);
    }

    // TODO: method to shift even after odd
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;
        Node<Integer> temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenHead.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }

        if (oddHead == null) {
            return evenHead;
        } else {
            oddTail.next = evenHead;
        }

        if (evenHead != null) {
            evenTail.next = null;
        }

        return oddHead;
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
