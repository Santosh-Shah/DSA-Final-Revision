package recursion.part2;

import javax.swing.*;

public class Q8_QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 0, 3, 90};
        quickSort(arr,0, arr.length - 1);
        for (int ans : arr) {
            System.out.println(ans);
        }
    }

    // Method for quick sort
    public static void quickSort(int[] a, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pivotIndex = partition(a, si, ei);
        quickSort(a, si, pivotIndex - 1);
        quickSort(a, pivotIndex + 1, ei);
    }

    // Method for partition
    public static int partition(int[] a, int si, int ei) {
        int pivotElem = a[si];
        int smallNumCount = 0;
        for (int i = si + 1; i <= ei; i++) {
            if (a[i] < pivotElem) {
                smallNumCount++;
            }
        }

        int temp = a[si + smallNumCount];
        a[si + smallNumCount] = pivotElem;
        a[si] = temp;

        int i = si;
        int j = ei;
        while (i < j) {
            if (a[i] < pivotElem) {
                i++;
            } else if (a[j] >= pivotElem) {
                j--;
            } else {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return si + smallNumCount;
    }
}
