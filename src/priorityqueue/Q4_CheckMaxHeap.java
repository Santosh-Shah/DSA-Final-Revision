package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q4_CheckMaxHeap {
    public static void main(String[] args) {
        int[] arr = {42, 20, 18, 6, 14, 11, 9, 4};
        System.out.println(checkMaxHeap(arr));
    }

    public static boolean checkMaxHeap(int[] arr) {
        if (arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;
            if (leftChildIndex < arr.length && arr[i] < arr[leftChildIndex]) {
                return false;
            }

            if (rightChildIndex < arr.length && arr[i] < arr[rightChildIndex]) {
                return false;
            }
        }

        return true;
    }
}
