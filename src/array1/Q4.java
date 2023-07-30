package array1;

import java.util.Scanner;

public class Q4 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO: Arrange the number into array
        // take size of array from user and putt into array from 1 to length of array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arrangeArray(arr, arr.length);
        printArray(arr);
    }


    public static void arrangeArray(int[] arr, int len) {
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
    }
}
