package revision_once.linkedlists.singly;

public class Q5_FindNode {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        printLL(head);
        System.out.println();
        int position = findNode(head, 30);
        System.out.println("Node available at: " + position + " index");

    }

    public static int findNode(Node<Integer> head, int target) {
        // Base case
        if (head == null) {
            return -1;
        }

        Node<Integer> temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.data == target) {
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1;
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
