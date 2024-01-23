package revision_once.linkedlists.singly;

import java.util.Scanner;

public class Q10_Palindrome {
    public static void main(String[] args) {
//        Node<Integer> head = createLL();
        Node<Integer> head = takeInput();
        printLL(head);
        System.out.println(isPalindrome(head));
    }

    // TODO: method to check palindrome
    public static boolean isPalindrome(Node<Integer> head) {
        // Base case
        if (head == null || head.next == null) {
            return true;
        }

        // step1 find node using fast and slow technique
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // step2 reverse second half
        Node<Integer> firstHalf = head;
        Node<Integer> secondHalf = reverse(slow);
        while (secondHalf != null) {
            if (!firstHalf.data.equals(secondHalf.data)) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
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
