package array1;

import java.util.Scanner;

public class Q5 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO: print pair of the array
        // take size of array from user and putt into array from 1 to length of array
        int[] arr = {1, 2, 3, 6, 8};
        printPairsOfArray(arr);
    }

    public static void printPairsOfArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }
}
