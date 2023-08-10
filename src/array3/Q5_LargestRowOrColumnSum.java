package array3;

import java.util.Enumeration;

public class Q5_LargestRowOrColumnSum {
    public static void main(String[] args) {
        //TODO: print largest column sum
        int[][] arr = {
                {1, 4, 5},
                {2, 2, 4},
                {6, 9, 2}
        };

        largestRowOrColumnSum(arr);
    }

    public static void largestRowOrColumnSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largestSum = 0;
        int rcIndexCount = 0;
        boolean isRow = true;

        if (rows == 0) {
            System.out.println("Row: " + rcIndexCount + " " + largestSum);
            return;
        }

        // it will find largest row sum
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > largestSum) {
                largestSum = sum;
                rcIndexCount = i;
            }
        }

        // it will find largest column sum
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }

            if (sum > largestSum) {
                largestSum = sum;
                rcIndexCount = j;
                isRow = false;
            }
        }

        // it will print actual output
        if (isRow) {
            System.out.println("Row: " + rcIndexCount + " " + largestSum);
        } else {
            System.out.println("Column: " + rcIndexCount + " " + largestSum);
        }
    }
}
