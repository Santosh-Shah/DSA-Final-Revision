package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q3_PrintKSmallestElements {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 2, 8, 9, 6, 1};
        ArrayList<Integer> ans = printKLargestElements(arr, 4);
        System.out.println(ans);
    }

    public static ArrayList<Integer> printKLargestElements(int[] arr, int k) {
        if (arr.length == 0) {
            return null;
        }
        // Build the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pq.peek() > arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        return ans;
    }
}
