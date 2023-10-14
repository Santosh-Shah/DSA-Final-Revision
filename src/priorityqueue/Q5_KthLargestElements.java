package priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q5_KthLargestElements {
    public static void main(String[] args) {
        int[] arr = {42, 20, 18, 6, 14, 11, 9, 4};
        int k = 2;
        System.out.println(k + "th largest element: " + kthLargestElement(arr, k));
    }

    public static int kthLargestElement(int[] arr, int k) {
        if (arr.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = Integer.MIN_VALUE;
        for (int i : arr) {
            pq.add(i);
        }

        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                ans = pq.peek();
            } else {
                pq.poll();
            }
        }

        return ans;
    }
}
