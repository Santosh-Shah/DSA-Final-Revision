package linkedlist.singly;

public class DoubleNode {
    Node<Integer> head;
    Node<Integer> tail;

    DoubleNode() {

    }

    // creating constructor for holding two value
    DoubleNode(Node<Integer> head, Node<Integer> tail) {
        this.head = head;
        this.tail = tail;
    }
}
