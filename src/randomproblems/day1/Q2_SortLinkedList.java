package randomproblems.day1;

public class Q2_SortLinkedList {
    // Methods to print linked list
    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            printLL(temp.next);
        }
    }

    // method to create linklist from array

    // method to sort linked list
    public static Node<Integer> sortLL(Node<Integer> head) {
        return head;
    }


    public static void main(String[] args) {
        int[] array = {5, 4, 6, 3, 0};
//        Node<Integer> head = createLL(array);

    }
}
