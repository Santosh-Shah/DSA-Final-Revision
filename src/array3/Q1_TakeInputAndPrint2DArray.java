package array3;

import java.util.Scanner;

public class Q1_TakeInputAndPrint2DArray {
    //TODO: take input of 2D array
    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int colm = sc.nextInt();

        int[][] arr = new int[rows][colm];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.println("Enter the element: " + i + "th row " + j + "th column");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    // TODO: print array
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // TODO: Main function
    public static void main(String[] args) {
//        int[][] arr = takeInput();
        int[][] arr = {
                {1, 2},
                {5, 20, 30}
        };
//        System.out.println(arr[1].length);
        printArray(arr);

    }
}
