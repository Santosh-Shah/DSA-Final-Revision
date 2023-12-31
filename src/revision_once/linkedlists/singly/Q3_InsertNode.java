package revision_once.linkedlists.singly;

public class Q3_InsertNode {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        printLL(head);
        System.out.println("\nAfter inserting new node");
        head = insertNode(head, 5, 8);
        printLL(head);

    }

    //TODO: Insert node at ith position
    public static Node<Integer> insertNode(Node<Integer> head, int pos, int data) {
        // Base case
        if (head == null) {
            return null;
        }

        Node<Integer> temp = head;
        Node<Integer> newNode = new Node<>(data);

        // if you want to add at first position
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        int index = pos;
        while (index != 1) {
            temp = temp.next;
            index--;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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
