package revision_once.arrays.hard;

import java.util.Scanner;

public class Q1_TakeInputAndPrintIn2DArray {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        printArray(arr);
    }

    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: " );
        int row = sc.nextInt();

        System.out.println("Enter Column: ");
        int column = sc.nextInt();

        int[][] output = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Element For " + i + "th row and " + j + "th column");
                output[i][j] = sc.nextInt();
            }
        }

        return output;
    }


    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int elements : row) {
                System.out.print(elements + " ");
            }
            System.out.println();
        }
    }
}
