package revision_once.linkedlists.singly;

import java.util.Scanner;

public class Q21_KReverse {
    public static void main(String[] args) {
//        Node<Integer> head = createLL();
        // delete every m nodes after n nodes
        // e.g.: 4 1 7 8 2 3 9, m = 2 (4, 1) now delete n = 3 (7, 8, 2) and continue this process till end
        Node<Integer> head = takeInput();
        printLL(head);
        head = reverseKNodes(head, 3);
        System.out.println();
        printLL(head);
    }

    // TODO: method to swap two nodes
    public static Node<Integer> reverseKNodes(Node<Integer> head, int k) {
        // Base case
        if (k == 0 || k == 1) {
            return head;
        }

        int count = 0;
        Node<Integer> current = head;
        Node<Integer> prev = null;
        Node<Integer> fwd = null;

        while (count < k && current != null) {
            fwd = current.next;
            current.next = prev;
            prev = current;
            current = fwd;
            count++;
        }

        if (fwd != null) {
            head.next = reverseKNodes(fwd, k);
        }
        return prev;
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
