package linkedlist.singly;

import java.util.LinkedList;

public class LLCollectionsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        int[] arr = {3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
//            ll = new LinkedList<>();
            ll.add(arr[i]);
        }

//        for (int i = 0; i < ll.size(); i++) {
//            System.out.println(ll.pop());
//        }
//        System.out.println(ll.size());
//        System.out.println(ll.getLast());
        ll.push(40);
        ll.add(4, 400);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.indexOf(5));
        System.out.println(ll.get(4));
//        while (ll.size() != 0) {
//            System.out.println(ll.pop());
//        }

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

    }
}
