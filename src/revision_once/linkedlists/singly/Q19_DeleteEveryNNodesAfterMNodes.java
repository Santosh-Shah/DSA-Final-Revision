package revision_once.linkedlists.singly;

import java.util.Scanner;

public class Q19_DeleteEveryNNodesAfterMNodes {
    public static void main(String[] args) {
//        Node<Integer> head = createLL();
        // delete every m nodes after n nodes
        // e.g.: 4 1 7 8 2 3 9, m = 2 (4, 1) now delete n = 3 (7, 8, 2) and continue this process till end
        Node<Integer> head = takeInput();
        printLL(head);
        head = deleteEveryNNodes(head, 2, 3);
        System.out.println();
        printLL(head);
    }

    // TODO: method to shift even after odd
    public static Node<Integer> deleteEveryNNodes(Node<Integer> head, int m, int n ) {
        // Base case
        if (head == null || m == 0) {
            return null;
        }

        if (n == 0) {
            return head;
        }

        Node<Integer> currentNode = head;
        Node<Integer> temp = null;
        while (currentNode != null) {
            int take = 0;
            int delete = 0;
            while (currentNode != null && take < m) {
                if (temp == null) {
                    temp = currentNode;
                } else {
                    temp.next = currentNode;
                    temp = temp.next;
                }
                currentNode = currentNode.next;
                take++;
            }

            while (currentNode != null && delete < n) {
                currentNode = currentNode.next;
                delete++;
            }
        }

        if (temp != null) {
            temp.next = null;
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
