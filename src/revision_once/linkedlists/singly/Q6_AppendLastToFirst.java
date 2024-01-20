package revision_once.linkedlists.singly;

public class Q6_AppendLastToFirst {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        printLL(head);
        System.out.println();
        head = appendLastToFirst(head, 2);
        printLL(head);

    }

    public static Node<Integer> appendLastToFirst(Node<Integer> head, int num) {
        // Base Case
        if (num == 0 || head == null) {
            return null;
        }

        Node<Integer> fast = head;
        Node<Integer> slow = head;
        for (int i = 0; i < num; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = head;
        head = temp;

        return head;
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
}
