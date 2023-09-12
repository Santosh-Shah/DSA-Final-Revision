package linkedlist.singly;

public class LinkedListUse {
    // methods to use linked list for practice
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    // method to print linked list
    public static void printNode(Node<Integer> head) {
        // Base case
        if (head == null) {
            return;
        }

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
//        Node<Integer> n1 = new Node<>(50);
//        System.out.println(n1);
//        System.out.println(n1.next);
//        System.out.println(n1.data.doubleValue());
//
//        Node<String> n2 = new Node<>("Santosh Shah");
//        System.out.println(n2);
//        System.out.println(n2.data);
//        System.out.println(n2.next);

        Node<Integer> head = createLinkedList();
        printNode(head);
    }
}
