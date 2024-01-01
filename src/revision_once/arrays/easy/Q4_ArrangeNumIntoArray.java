package revision_once.arrays.easy;

import java.util.Scanner;

public class Q4_ArrangeNumIntoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        arrangeNumberIntoArray(arr, arr.length);
        printArray(arr);

    }

    public static int[] arrangeNumberIntoArray(int[] arr, int len) {
        int left = 0;
        int right = len - 1;
        int count = 1;

        while (left <= right) {
            if (count % 2 == 1) {
                arr[left] = count;
                count++;
                left++;
            } else {
                arr[right] = count;
                count++;
                right--;
            }
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
